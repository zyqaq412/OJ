package 二叉树;

/**
 * @title: no_100_相同的树
 * @Author zxwyhzy
 * @Date: 2023/10/14 22:21
 * @Version 1.0
 */
@SuppressWarnings("all")
public class no_100_相同的树 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;

        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);

    }
}
