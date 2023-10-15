package 二叉树;

import java.util.ArrayList;
import java.util.List;

/**
 * @title: no_113_路径总和II
 * @Author zxwyhzy
 * @Date: 2023/10/15 10:55
 * @Version 1.0
 */
public class no_113_路径总和II {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        process(root,targetSum,0,new ArrayList<>());
        return ans;
    }
    public void process(TreeNode root, int targetSum,int sum,List<Integer> path){
        if (root == null) return;
        if (root.left == null && root.right == null){
            if (sum + root.val == targetSum){
                path.add(root.val);
                ans.add(new ArrayList<>(path));
                // 返回到上一层时需要 回溯
                path.remove(path.size()-1);
            }
            return;
        }
        path.add(root.val);
        process(root.left,targetSum,sum+root.val,path);
        process(root.right,targetSum,sum+root.val,path);
        // 回溯
        path.remove(path.size()-1);
    }
}
