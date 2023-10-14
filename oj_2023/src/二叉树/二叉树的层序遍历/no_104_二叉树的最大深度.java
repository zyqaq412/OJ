package 二叉树.二叉树的层序遍历;

import 二叉树.TreeNode;

/**
 * @title: no_104_二叉树的最大深度
 * @Author zxwyhzy
 * @Date: 2023/10/14 18:01
 * @Version 1.0
 */
public class no_104_二叉树的最大深度 {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        int max = Math.max(l, r);
        return max + 1;
    }
}
