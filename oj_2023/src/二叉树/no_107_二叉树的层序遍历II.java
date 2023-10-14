package 二叉树;

import java.util.ArrayList;
import java.util.List;

/**
 * @title: no_107_二叉树的层序遍历II
 * @Author zxwyhzy
 * @Date: 2023/10/14 13:00
 * @Version 1.0
 * 给你二叉树的根节点 root ，返回其节点值 自底向上的层序遍历 。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
 */
public class no_107_二叉树的层序遍历II {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> temp = new ArrayList<>();
        process(root,temp,0);
        // 反转
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = temp.size()-1;i>=0;i--){
            ans.add(temp.get(i));
        }
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
