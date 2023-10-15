package 二叉树;

/**
 * @title: no_404_左叶子之和
 * @Author zxwyhzy
 * @Date: 2023/10/15 10:03
 * @Version 1.0
 */
public class no_404_左叶子之和 {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        // l 是 root.left 左叶子节点的值
        int l = sumOfLeftLeaves(root.left);
        // r 是 root.right 左叶子节点的值
        int r = sumOfLeftLeaves(root.right);


        if (root.left != null && root.left.left == null && root.left.right == null) {
            // 该结点的左结点是叶子结点 那该结点的左结点就没有左叶子节点 l = 0; 重新赋值l
            l = root.left.val;
        }

        return l + r;
    }
}
