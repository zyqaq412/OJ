package 二叉树;

import java.util.List;

/**
 * @title: Node
 * @Author zxwyhzy
 * @Date: 2023/10/14 17:29
 * @Version 1.0
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
