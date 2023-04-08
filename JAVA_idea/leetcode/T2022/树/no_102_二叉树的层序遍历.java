package 树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @title: no_102_二叉树的层序遍历
 * @Author zxwyhzy
 * @Date: 2023/4/8 16:20
 * @Version 1.0
 */
public class no_102_二叉树的层序遍历 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    class Solution {
        // 广度优先遍历
        public List<List<Integer>> levelOrder1(TreeNode root) {
            if (root == null) return new ArrayList<>();
            List<List<Integer>> lists = new ArrayList<>();
            // 创建队列 将头节点加入队列
            Queue<TreeNode> queue = new LinkedList();
            queue.add(root);
            while (!queue.isEmpty()){
                // 在每一层遍历开始前，先记录队列中的结点数量（也就是这一层的结点数量），
                // 然后一口气处理完这一层的n 个结点。
                int n = queue.size();
                List<Integer> list = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    TreeNode remove = queue.poll();
                    if (remove.left!=null) queue.add(remove.left);
                    if (remove.right!=null) queue.add(remove.right);
                    list.add(remove.val);
                }
                lists.add(list);
            }
            return lists;
        }

        // 递归方式 深度优先遍历
        public List<List<Integer>> levelOrder2(TreeNode root) {
            if (root == null) return new ArrayList<>();
            List<List<Integer>> lists = new ArrayList<>();
            // traversal(lists,root,0);
            // 头结点在第一层
            traversal(lists,root,1);
            return lists;
        }
        private void traversal(List<List<Integer>> list,TreeNode root,int lever){
            if (root == null) return;
            // if (list.size() == lever)list.add(new ArrayList<>());
            // list.size()(共有几层) < lever(当前是第几层) 说明当前层还没有创建出来
            if (list.size() < lever)list.add(new ArrayList<>());
            // list.get(lever).add(root.val);
            list.get(lever-1).add(root.val);
            // 先遍历左节点
            traversal(list,root.left,lever+1);
            traversal(list,root.right,lever+1);
        }
    }
}



