package 二叉树.二叉搜索树;

import 二叉树.TreeNode;

/**
 * @title: no_669_修剪二叉搜索树
 * @Author zxwyhzy
 * @Date: 2023/10/18 15:44
 * @Version 1.0
 */
public class no_669_修剪二叉搜索树 {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null) return null;
        if (root.val < low) return trimBST(root.right,low,high);
        if (root.val > high) return trimBST(root.left,low,high);
        root.left = trimBST(root.left,low,high);
        root.right = trimBST(root.right,low,high);

        return root;
    }
}
