package 二叉树;

import java.util.ArrayList;
import java.util.List;

/**
 * @title: no_145_二叉树后序序遍历
 * @Author zxwyhzy
 * @Date: 2023/10/13 22:08
 * @Version 1.0
 */
public class no_145_二叉树后序序遍历 {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        process(ans,root);
        return ans;
    }
    public void process (List<Integer> ans,TreeNode node){
        if (node == null) return;
        process(ans,node.left);
        process(ans,node.right);
        ans.add(node.val);
    }
}
