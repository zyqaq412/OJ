package 二叉树;

/**
 * @title: no_111_二叉树的最小深度
 * @Author zxwyhzy
 * @Date: 2023/10/14 18:05
 * @Version 1.0
 */
public class no_111_二叉树的最小深度 {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        int l = minDepth(root.left);
        int r = minDepth(root.right);
        // 只有当左右孩子都为空的时候，才说明遍历的最低点了。
        if (l == 0) return r + 1;
        if (r == 0) return l + 1;
        return Math.min(l, r) + 1;
    }
}
