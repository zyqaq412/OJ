package 树;

import javax.swing.tree.TreeNode;

/**
 * @title: no_2236_判断根结点是否等于子结点之和
 * @Author zxwyhzy
 * @Date: 2023/2/21 21:59
 * @Version 1.0
 * 给你一个 二叉树 的根结点 root，该二叉树由恰好 3 个结点组成：根结点、左子结点和右子结点。
 *
 * 如果根结点值等于两个子结点值之和，返回 true ，否则返回 false 。

 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class no_2236_判断根结点是否等于子结点之和 {
    public boolean checkTree(TreeNode root) {
        return root.val == (root.left.val+root.right.val);
    }
    public class TreeNode {
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
