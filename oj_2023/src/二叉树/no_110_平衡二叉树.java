package 二叉树;

/**
 * @title: no_110_平衡二叉树
 * @Author zxwyhzy
 * @Date: 2023/10/14 22:38
 * @Version 1.0
 */
public class no_110_平衡二叉树 {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return countNodes(root) == -1;
    }

    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        int l = countNodes(root.left);
        int r = countNodes(root.right);
        if (l == -1 || r == -1) return -1;
        if (Math.abs(l - r) > 1) return -1;
        // 最大深度
        return Math.max(l, r) + 1;
    }
}
