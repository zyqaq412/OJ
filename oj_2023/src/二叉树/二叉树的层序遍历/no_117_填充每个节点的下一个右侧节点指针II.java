package 二叉树.二叉树的层序遍历;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @title: no_117_填充每个节点的下一个右侧节点指针II
 * @Author zxwyhzy
 * @Date: 2023/10/14 17:57
 * @Version 1.0
 */
public class no_117_填充每个节点的下一个右侧节点指针II {
    public Node connect(Node root) {
        if (root == null) return root;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            Node pre = null;
            for (int i = 0; i < size; i++) {
                Node poll = queue.poll();
                if (poll.left != null) queue.add(poll.left);
                if (poll.right != null) queue.add(poll.right);
                if (i == 0){
                    pre = poll;
                    continue;
                }
                pre.next = poll;
                pre = poll;
            }
        }
        return root;
    }




    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }
}
