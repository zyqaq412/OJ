package 二叉树;

/**
 * @title: no_236_二叉树的最近公共祖先
 * @Author zxwyhzy
 * @Date: 2023/10/17 20:22
 * @Version 1.0
 */
public class no_236_二叉树的最近公共祖先 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        TreeNode l = lowestCommonAncestor(root.left, p, q);
        TreeNode r = lowestCommonAncestor(root.right, p, q);
        if (root.val == p.val || root.val == q.val) return root;
        // l 节点不为空 说明 l是p或q 并且 root 也是 等于 p 或 q 那 root就是最近公共祖先  ,r 同理
        if ((l != null || r != null) &&(root.val == p.val || root.val == q.val) || (l != null && r != null)) return root;


        return l == null ? r : l;
    }
  /*          if(root == null) return null;
    TreeNode l = lowestCommonAncestor(root.left, p, q);
    TreeNode r = lowestCommonAncestor(root.right, p, q);
        if (root.val == p.val || root.val == q.val) return root;
        if (l != null && (root.val == p.val || root.val == q.val)) return root;
        if (r != null && (root.val == p.val || root.val == q.val)) return root;
        if (l != null && r != null) return root;
        return l == null ? r : l;
}*/
}
