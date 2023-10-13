package 二叉树;

import java.util.ArrayList;
import java.util.List;

/**
 * @title: no_94_二叉树的中序遍历
 * @Author zxwyhzy
 * @Date: 2023/10/13 22:10
 * @Version 1.0
 */
public class no_94_二叉树的中序遍历 {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        process(ans,root);
        return ans;
    }
    public void process (List<Integer> ans,TreeNode node){
        if (node == null) return;
        process(ans,node.left);
        ans.add(node.val);
        process(ans,node.right);

    }
}
