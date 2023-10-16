package 二叉树;

import java.util.ArrayList;
import java.util.List;

/**
 * @title: no_530_二叉搜索树的最小绝对差
 * @Author zxwyhzy
 * @Date: 2023/10/16 15:47
 * @Version 1.0
 */
public class no_530_二叉搜索树的最小绝对差 {

    int min = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        process(root, list);
        Object[] array = list.toArray();
        // Arrays.sort(array);
        for (int i = 1; i < array.length; i++) {
            min = Math.min(min, (Integer) array[i] - (Integer) array[i - 1]);
        }
        return min;
    }

    private void process(TreeNode root, List<Integer> list) {
        if (root == null) return;
        // list.add(root.val);
        process(root.left, list);
        // 中序遍历二叉搜索树 元素有序 减少一次排序
        list.add(root.val);
        process(root.right, list);
    }
}
