package 二叉树.二叉搜索树;

import 二叉树.TreeNode;

/**
 * @title: no_538_把二叉搜索树转换为累加树
 * @Author zxwyhzy
 * @Date: 2023/10/18 20:13
 * @Version 1.0
 */
public class no_538_把二叉搜索树转换为累加树 {
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        process(root);
        return root;
    }
    private void  process(TreeNode root){
        if (root == null) return;
        process(root.right);
        sum += root.val;
        root.val = sum;
        process(root.left);
    }
}
