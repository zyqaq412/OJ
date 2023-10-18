package 二叉树.二叉搜索树;

import 二叉树.TreeNode;

/**
 * @title: no_450_删除二叉搜索树中的节点
 * @Author zxwyhzy
 * @Date: 2023/10/18 15:30
 * @Version 1.0
 */
public class no_450_删除二叉搜索树中的节点 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null ) return root;
        if (root.val == key){
            if (root.left == null){
                return root.right;
            }else if (root.right == null){
                return root.left;
            }else {
                TreeNode tempLeft = root.left;
                TreeNode right = root.right;
                root = root.right;
                while (root.left != null){
                    root = root.left;
                }
                root.left = tempLeft;
                return right;
            }
        }
        if (root.val > key) root.left = deleteNode(root.left,key);
        if (root.val < key) root.right = deleteNode(root.right,key);
        return root;
    }
}
