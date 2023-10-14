package 二叉树;

/**
 * @title: no_226_反转二叉树
 * @Author zxwyhzy
 * @Date: 2023/10/14 22:04
 * @Version 1.0
 */
public class no_226_反转二叉树 {
    public TreeNode invertTree(TreeNode root) {
        process(root);

        return root;
    }
    public void process(TreeNode root) {
        if (root == null) return;
        invertTree(root.left);
        invertTree(root.right);
        TreeNode temp = root.right;

        root.right = root.left;
        root.left = temp;
    }
}
