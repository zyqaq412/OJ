package 二叉树;

/**
 * @title: no_101_对称二叉树
 * @Author zxwyhzy
 * @Date: 2023/10/14 22:12
 * @Version 1.0
 */
@SuppressWarnings("all")
public class no_101_对称二叉树 {
    public boolean isSymmetric(TreeNode root) {

        return isduic(root, root);

    }

    public boolean isduic(TreeNode l, TreeNode r) {
        if (l == null && r == null) return true;
        if (l == null || r == null) return false;
        if (l.val != r.val) return false;
        return isduic(l.left, r.right) && isduic(l.right, r.left);
    }
}
