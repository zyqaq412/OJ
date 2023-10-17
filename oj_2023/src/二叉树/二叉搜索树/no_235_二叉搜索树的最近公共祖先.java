package 二叉树.二叉搜索树;

import 二叉树.TreeNode;

/**
 * @title: no_235_二叉搜索树的最近公共祖先
 * @Author zxwyhzy
 * @Date: 2023/10/17 22:01
 * @Version 1.0
 */
public class no_235_二叉搜索树的最近公共祖先 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        TreeNode l = lowestCommonAncestor(root.left, p, q);
        TreeNode r = lowestCommonAncestor(root.right, p, q);
        if (root.val == p.val || root.val == q.val) return root;
        // l 节点不为空 说明 l是p或q 并且 root 也是 等于 p 或 q 那 root就是最近公共祖先  ,r 同理
        if ((l != null || r != null) &&(root.val == p.val || root.val == q.val) || (l != null && r != null)) return root;


        return l == null ? r : l;
    }
    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val > p.val && root.val > q.val) return lowestCommonAncestor2(root.left, p, q);
        if (root.val < p.val && root.val < q.val) return lowestCommonAncestor2(root.right, p, q);
        return root;
    }
}
