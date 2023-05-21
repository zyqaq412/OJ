/**
 * @title: no_226_翻转二叉树
 * @Author zxwyhzy
 * @Date: 2023/5/21 19:06
 * @Version 1.0
 * 给你一棵二叉树的根节点 root ，翻转这棵二叉树，并返回其根节点。
 */
public class no_226_翻转二叉树 {
    class Solution {
        public TreeNode invertTree(TreeNode root) {
            dp(root);
            return root;
        }

        public void dp(TreeNode node) {
            if (node == null) return;
            // 交换当前结点的左右结点
            TreeNode left = node.left;
            node.left=node.right;
            node.right = left;
            // 递归交换 左子树
            dp(node.left);
            // 递归交换 右子树
            dp(node.right);
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
