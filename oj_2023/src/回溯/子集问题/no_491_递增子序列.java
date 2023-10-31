package 回溯.子集问题;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * @title: no_491_递增子序列
 * @Author zxwyhzy
 * @Date: 2023/10/31 14:30
 * @Version 1.0
 */
public class no_491_递增子序列 {
    List<List<Integer>> ans = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> findSubsequences(int[] nums) {
        process(nums, 0);
        return ans;
    }

    private void process(int[] nums, int start) {
        if (path.size() >= 2) ans.add(new ArrayList<>(path));

        HashSet<Integer> set = new HashSet<>();
        for (int i = start; i < nums.length; i++) {
            if (path.size() != 0 &&  nums[i] < path.getLast().intValue()) continue;
            if (set.contains(nums[i])) continue;
            // 之前的题 数组都排序了 所以相等一定想邻
            // 这道题 因为不能排序 所以这样判断 只能跳过相邻且相等
            // if (i != start && nums[i] == nums[i - 1]) continue;
            set.add(nums[i]);
            path.add(nums[i]);
            process(nums,i+1);
            path.removeLast();
        }
    }
}
