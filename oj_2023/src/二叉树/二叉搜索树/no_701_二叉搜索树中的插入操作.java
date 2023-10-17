package 二叉树.二叉搜索树;

import 二叉树.TreeNode;

/**
 * @title: no_701_二叉搜索树中的插入操作
 * @Author zxwyhzy
 * @Date: 2023/10/17 22:35
 * @Version 1.0
 */
public class no_701_二叉搜索树中的插入操作 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        if (root.val > val) {
            if (root.left != null) insertIntoBST(root.left,val);
            else root.left = new TreeNode(val);
        }else {
            if (root.right != null) insertIntoBST(root.right,val);
            else root.right = new TreeNode(val);
        }
        return root;
    }
}
