package 二叉树;

import java.util.*;

/**
 * @title: no_637_二叉树的层平均值
 * @Author zxwyhzy
 * @Date: 2023/10/14 17:19
 * @Version 1.0
 * 给定一个非空二叉树的根节点 root , 以数组的形式返回每一层节点的平均值。与实际答案相差 10-5 以内的答案可以被接受。
 */
public class no_637_二叉树的层平均值 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int levelSize = queue.size();
            long sum = 0;
            for (int i = 0; i < levelSize; i++) {
                TreeNode poll = queue.poll();
                sum += poll.val;
                if (poll.left != null) {
                    queue.add(poll.left);
                }
                if (poll.right != null) {
                    queue.add(poll.right);
                }
            }
            ans.add( (double)sum/levelSize);
        }
        return ans;
    }
}
