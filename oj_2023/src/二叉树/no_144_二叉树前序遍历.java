package 二叉树;

import java.util.ArrayList;
import java.util.List;

/**
 * @title: no_144_二叉树前序遍历
 * @Author zxwyhzy
 * @Date: 2023/10/13 22:01
 * @Version 1.0
 */
public class no_144_二叉树前序遍历 {
    public List<Integer> preorderTraversal(TreeNode root) {

        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        process(ans,root);
        return ans;
    }
    public void process (List<Integer> ans,TreeNode node){
        if (node == null) return;
        ans.add(node.val);
        process(ans,node.left);
        process(ans,node.right);
    }
}
