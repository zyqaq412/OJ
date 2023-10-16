package 二叉树;

/**
 * @title: no_654_最大二叉树
 * @Author zxwyhzy
 * @Date: 2023/10/16 14:28
 * @Version 1.0
 * 给定一个不重复的整数数组 nums 。 最大二叉树 可以用下面的算法从 nums 递归地构建:
 *
 * 创建一个根节点，其值为 nums 中的最大值。
 * 递归地在最大值 左边 的 子数组前缀上 构建左子树。
 * 递归地在最大值 右边 的 子数组后缀上 构建右子树。
 * 返回 nums 构建的 最大二叉树 。
 */
public class no_654_最大二叉树 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return process(nums,0,nums.length);
    }
    private TreeNode process(int[] nums,int i,int j){
        if (i >= j) return null;
        int[] ans = getMax(nums, i, j);

        TreeNode root = new TreeNode(ans[0]);
        root.left = process(nums,i,ans[1]);
        root.right = process(nums,ans[1]+1,j);
        return root;
    }
    private int[] getMax(int[] nums,int i,int j){
        int[] ans = new int[2];
        int max = -1;
        for (int ii = i; ii < j; ii++) {
            if (nums[ii]> max){
                max = nums[ii];
                ans[0] = max;
                ans[1] = ii;
            }
        }
        return ans;
    }
}
