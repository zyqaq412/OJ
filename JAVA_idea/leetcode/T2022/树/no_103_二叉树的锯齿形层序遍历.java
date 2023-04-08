package 树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @title: no_103_二叉树的锯齿形层序遍历
 * @Author zxwyhzy
 * @Date: 2023/4/8 15:47
 * @Version 1.0
 */
public class no_103_二叉树的锯齿形层序遍历 {
    class Solution {
        // 广度优先搜索
        public List<List<Integer>> zigzagLevelOrder1(TreeNode root) {
            if (root == null) return new ArrayList<>();
            List<List<Integer>> lists = new ArrayList<>();
            // 创建队列 将头节点加入队列
            Queue<TreeNode> queue = new LinkedList();
            queue.add(root);
            int count = 0;
            while (!queue.isEmpty()){
                // 在每一层遍历开始前，先记录队列中的结点数量（也就是这一层的结点数量），
                // 然后一口气处理完这一层的n 个结点。
                int n = queue.size();
                List<Integer> list = new LinkedList<>();
                for (int i = 0; i < n; i++) {
                    TreeNode remove = queue.poll();
                    if (remove.left!=null) queue.add(remove.left);
                    if (remove.right!=null) queue.add(remove.right);
                    if ((count & 1) == 1) list.add(0, remove.val);
                    else list.add(remove.val);
                }
                lists.add(list);
                count++;
            }
            return lists;
        }






        // 深度优先遍历
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            List<List<Integer>> res = new ArrayList<>();
            traversal(root, res, 0);
            return res;
        }

        private void traversal(TreeNode root, List<List<Integer>> res, int level) {
            if (root == null) {
                return;
            }

            if (res.size() == level) {
                res.add(new LinkedList<>());
            }
            // & 全1为1
            if ((level & 1) == 1){
                // 奇数层
                res.get(level).add(0, root.val);
            } else {
                res.get(level).add(root.val);
            }

            traversal(root.left, res, level + 1);
            traversal(root.right, res, level + 1);
        }
    }

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
}
