package 二叉树;

import java.util.ArrayList;
import java.util.List;

/**
 * @title: no_257_二叉树的所有路径
 * @Author zxwyhzy
 * @Date: 2023/10/14 22:53
 * @Version 1.0
 * 给你一个二叉树的根节点 root ，按 任意顺序 ，返回所有从根节点到叶子节点的路径。
 * <p>
 * 叶子节点 是指没有子节点的节点。
 */
public class no_257_二叉树的所有路径 {
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> ans = new ArrayList<>();
        process(ans,"", root);
        return ans;
    }

    public void process(List<String> ans, String s, TreeNode root) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            ans.add(new StringBuilder(s).append(root.val).toString());
            return;
        }
        s = new StringBuilder(s).append(root.val).append("->").toString();
        process(ans, s, root.left);
        process(ans, s, root.right);
    }
}
