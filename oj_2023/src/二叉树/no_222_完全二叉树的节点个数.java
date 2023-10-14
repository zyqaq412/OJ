package 二叉树;

/**
 * @title: no_222_完全二叉树的节点个数
 * @Author zxwyhzy
 * @Date: 2023/10/14 22:30
 * @Version 1.0
 */
@SuppressWarnings("all")
public class no_222_完全二叉树的节点个数 {


    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        int l = countNodes(root.left);
        int r = countNodes(root.right);
        return l + r + 1;
    }
}
