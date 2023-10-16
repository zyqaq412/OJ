package 二叉树.二叉搜索树;

import 二叉树.TreeNode;

/**
 * @title: no_700_二叉搜索树中的搜索
 * @Author zxwyhzy
 * @Date: 2023/10/16 15:07
 * @Version 1.0
 */
public class no_700_二叉搜索树中的搜索 {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        if (root.val == val) return root;
        if (root.val > val) {
            return searchBST(root.left, val);
        } else {
            return searchBST(root.right, val);
        }
    }
}
