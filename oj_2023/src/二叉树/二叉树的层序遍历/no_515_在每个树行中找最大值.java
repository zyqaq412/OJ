package 二叉树.二叉树的层序遍历;

import 二叉树.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @title: no_515_在每个树行中找最大值
 * @Author zxwyhzy
 * @Date: 2023/10/14 17:37
 * @Version 1.0
 */
public class no_515_在每个树行中找最大值 {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int levelSize = queue.size();
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < levelSize; i++) {
                TreeNode poll = queue.poll();
                max = max > poll.val ? max : poll.val;
                if (poll.left != null) {
                    queue.add(poll.left);
                }
                if (poll.right != null) {
                    queue.add(poll.right);
                }
            }
            ans.add(max);
        }
        return ans;
    }
}
