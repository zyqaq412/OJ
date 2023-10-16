package 二叉树;

/**
 * @title: no_98_验证二叉搜索树
 * @Author zxwyhzy
 * @Date: 2023/10/16 15:14
 * @Version 1.0
 */
public class no_98_验证二叉搜索树 {

    TreeNode max;
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        // 左
        boolean left = isValidBST(root.left);
        if (!left) {
            return false;
        }
        // 中
        if (max != null && root.val <= max.val) {
            return false;
        }
        max = root;
        // 右
        boolean right = isValidBST(root.right);
        return right;
    }

    // 这段代码没有保证 左子树所有节点小于中间节点，右子树所有节点大于中间节点
    public boolean isValidBST2(TreeNode root) {
        if (root == null) return true;
        if (root.left == null && root.right == null) return true;
        if (root.left == null) return root.val < root.right.val && isValidBST2(root.right);
        if (root.right == null) return root.val > root.left.val && isValidBST2(root.left);
        if (root.val >= root.right.val || root.val <= root.left.val) return false;
        return isValidBST2(root.left) && isValidBST2(root.right);
    }
}
