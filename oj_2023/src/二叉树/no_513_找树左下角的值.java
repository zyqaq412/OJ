package 二叉树;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @title: no_513_找树左下角的值
 * @Author zxwyhzy
 * @Date: 2023/10/15 10:31
 * @Version 1.0
 */
public class no_513_找树左下角的值 {

    // 这题用迭代更好做
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int ans = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                // 存每一层的第一个数
                if (i == 0) ans = poll.val;
                if (poll.left != null) queue.add(poll.left);
                if (poll.right != null) queue.add(poll.right);

            }
        }
        return ans;
    }
}
