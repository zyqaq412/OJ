package 二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @title: no_199_二叉树的右视图
 * @Author zxwyhzy
 * @Date: 2023/10/14 13:37
 * @Version 1.0
 */
public class no_199_二叉树的右视图 {
    // 层序遍历的时候，判断是否遍历到单层的最后面的元素，如果是，就放进result数组中，随后返回result就可以了。
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        // 队列 先进先出
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode poll = queue.poll();
                if (poll.left != null) {
                    queue.add(poll.left);
                }
                if (poll.right != null) {
                    queue.add(poll.right);
                }
                if (i == levelSize - 1) {
                    ans.add(poll.val);
                }
            }

        }
        return ans;
    }
}
