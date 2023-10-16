package 二叉树.二叉搜索树;

import 二叉树.TreeNode;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @title: no_501_二叉搜索中的众数
 * @Author zxwyhzy
 * @Date: 2023/10/16 16:08
 * @Version 1.0
 * 给你一个含重复值的二叉搜索树（BST）的根节点 root ，找出并返回 BST 中的所有 众数（即，出现频率最高的元素）。
 * <p>
 * 如果树中有不止一个众数，可以按 任意顺序 返回。
 * <p>
 * 假定 BST 满足如下定义：
 * <p>
 * 结点左子树中所含节点的值 小于等于 当前节点的值
 * 结点右子树中所含节点的值 大于等于 当前节点的值
 * 左子树和右子树都是二叉搜索树
 */
public class no_501_二叉搜索中的众数 {
    Map<Integer,Integer> map = new HashMap<>();
    public int[] findMode(TreeNode root) {
        process(root);
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        int count = 1;
        // 使用Stream和Comparator来对entry集合按键升序排序
        List<Map.Entry<Integer, Integer>> list = entries.stream()
                .sorted(Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder()))
                .collect(Collectors.toList());

        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i).getValue() == list.get(i+1).getValue()) count++;
            else break;
        }
        int[] ans = new int[count];
        for (int i = 0; i < count; i++) {
            ans[i] = list.get(i).getKey();
        }

        return ans;
    }

    private void process(TreeNode root) {
        if (root == null) return;
        map.put(root.val,map.getOrDefault(root.val,0)+1);
        process(root.left);
        process(root.right);
    }
}
