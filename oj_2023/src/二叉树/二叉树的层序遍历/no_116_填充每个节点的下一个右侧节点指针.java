package 二叉树.二叉树的层序遍历;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @title: no_116_填充每个节点的下一个右侧节点指针
 * @Author zxwyhzy
 * @Date: 2023/10/14 17:43
 * @Version 1.0
 * 给定一个 完美二叉树 ，其所有叶子节点都在同一层，每个父节点都有两个子节点。二叉树定义如下：
 *
 * struct Node {
 *   int val;
 *   Node *left;
 *   Node *right;
 *   Node *next;
 * }
 * 填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 NULL。
 *
 * 初始状态下，所有 next 指针都被设置为 NULL。
 */
public class no_116_填充每个节点的下一个右侧节点指针 {
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

