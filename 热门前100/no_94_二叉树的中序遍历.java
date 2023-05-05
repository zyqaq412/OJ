import java.util.ArrayList;
import java.util.List;

/**
 * @title: no_94_二叉树的中序遍历
 * @Author zxwyhzy
 * @Date: 2023/5/5 21:58
 * @Version 1.0
 */
public class no_94_二叉树的中序遍历 {


    class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            var list = new ArrayList<Integer>();
            inorder(root,list);
            return list;

        }
        public void inorder(TreeNode head,List<Integer> list){
            // 中序遍历  先遍历左节点 然后根节点 最好右结点
            if (null == head){
                return;
            }
            // 向左递归 左边为空 head就是最左边的结点了
            inorder(head.left,list);

            list.add(head.val);

            inorder(head.right,list);

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
