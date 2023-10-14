package 二叉树.二叉树的层序遍历;

import 二叉树.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @title: no_102_二叉树的层序遍历
 * @Author zxwyhzy
 * @Date: 2023/10/14 12:50
 * @Version 1.0
 */
public class no_102_二叉树的层序遍历 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        process(root,ans,0);
        return ans;
    }

    // level 当前层数
    public void process(TreeNode node, List<List<Integer>> ans, int level) {
        if (node == null) return;
        if (level >= ans.size()) ans.add(new ArrayList<>());
        ans.get(level).add(node.val);
        process(node.left,ans,level+1);
        process(node.right,ans,level+1);
    }
}
