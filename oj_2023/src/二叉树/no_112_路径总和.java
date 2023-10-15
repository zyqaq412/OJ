package 二叉树;

/**
 * @title: no_112_路径总和
 * @Author zxwyhzy
 * @Date: 2023/10/15 10:45
 * @Version 1.0
 */
public class no_112_路径总和 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return process(root, targetSum, 0);
    }

    public boolean process(TreeNode root, int targetSum, int sum) {
        if (root == null) return false;
        // 是叶子节点 返回是否满足条件
        if (root.left == null && root.right == null) {
            return (sum + root.val) == targetSum;
        }
        boolean l = process(root.left, targetSum, sum + root.val);
        boolean r = process(root.right, targetSum, sum + root.val);
        return l || r;
    }
}
