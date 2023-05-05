/**
 * @title: no_104_二叉树的最大深度
 * @Author zxwyhzy
 * @Date: 2023/5/5 22:44
 * @Version 1.0
 * 给定一个二叉树，找出其最大深度。
 *
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 */
public class no_104_二叉树的最大深度 {


    class Solution {
        public int maxDepth(TreeNode root) {
            return dfs(root,0);
        }
        public int dfs(TreeNode r, int count){
            // 当前结点为空了就返回记录的深度
            if(null == r){
                return count;
            }
            // 不为空深度加1
            count++;
            // 左边深度
            int left = dfs(r.left,count);
            // 右边深度
            int right = dfs(r.right,count);
            // 返回两边最深的深度
            return Math.max(left, right);
        }


        public int maxDepth2(TreeNode root) {
            // 当前结点为空了就返回0
            if(root == null) {
                return 0;
            } else {
                int left = maxDepth2(root.left);
                int right = maxDepth2(root.right);
                // 不为空返回两边最深的深度加上当前层的深度
                return Math.max(left, right) + 1;
            }
        }
    }



    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
