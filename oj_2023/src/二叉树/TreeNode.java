package 二叉树;

/**
 * @title: TreeNode
 * @Author zxwyhzy
 * @Date: 2023/10/13 22:01
 * @Version 1.0
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
