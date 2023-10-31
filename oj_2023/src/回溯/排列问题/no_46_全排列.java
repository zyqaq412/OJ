package 回溯.排列问题;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @title: no_46_全排列
 * @Author zxwyhzy
 * @Date: 2023/10/31 15:26
 * @Version 1.0
 * 给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。
 */
public class no_46_全排列 {
    List<List<Integer>> ans = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    boolean[] bool;
    public List<List<Integer>> permute(int[] nums) {
        bool = new boolean[nums.length];
        process(nums);
        return ans;
    }


    private void process(int[] nums) {
        if (path.size() == nums.length) {
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (bool[i]) continue;
            bool[i] = true;
            path.add(nums[i]);
            process(nums);
            path.removeLast();
            bool[i] = false;
        }
    }

/*    private void process(int[] nums) {
        if (path.size() == nums.length) {
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (path.contains(nums[i])) continue;
            path.add(nums[i]);
            process(nums);
            path.removeLast();
        }
    }*/
}
