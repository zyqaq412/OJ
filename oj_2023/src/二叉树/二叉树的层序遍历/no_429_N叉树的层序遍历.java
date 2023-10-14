package 二叉树.二叉树的层序遍历;


import 二叉树.Node;

import java.util.*;

/**
 * @title: no_429_N叉树的层序遍历
 * @Author zxwyhzy
 * @Date: 2023/10/14 17:28
 * @Version 1.0
 */
public class no_429_N叉树的层序遍历 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                Node poll = queue.poll();
                temp.add(poll.val);
                addAll(queue, poll.children);
            }
            ans.add(temp);
        }
        return ans;
    }

    public void addAll(Queue queue, List<Node> children) {
        for (int i = 0; i < children.size(); i++) {
            queue.add(children.get(i));
        }
    }
}
