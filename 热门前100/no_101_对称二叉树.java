/**
 * @title: no_101_对称二叉树
 * @Author zxwyhzy
 * @Date: 2023/5/5 22:27
 * @Version 1.0
 *
 * 给你一个二叉树的根节点 root ， 检查它是否轴对称。
 */
public class no_101_对称二叉树 {
    class Solution {
        public boolean isSymmetric(TreeNode root) {

            return isduic(root,root);

        }
        public boolean isduic(TreeNode l,TreeNode r){
            // 同时为空 相当于值相等
            if(l==null&&r==null) return true;
            // 相当于值不等
            if(l==null||r==null) return false;
            // 值不相等返回false
            if(l.val != r.val) return false;
            // 左边的左边等于右边的右边  左边的右边等于右边的左边
            return isduic(l.left,r.right)&&isduic(l.right,r.left);
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
