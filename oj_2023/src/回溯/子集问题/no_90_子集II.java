package 回溯.子集问题;

import java.util.*;

/**
 * @title: no_90_子集II
 * @Author zxwyhzy
 * @Date: 2023/10/31 13:46
 * @Version 1.0
 * <p>
 * 给你一个整数数组 nums ，其中可能包含重复元素，请你返回该数组所有可能的子集（幂集）。
 * 解集 不能 包含重复的子集。返回的解集中，子集可以按 任意顺序 排列。
 */
public class no_90_子集II {
    List<List<Integer>> ans = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();


    // 快
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        process(nums, 0);
        return ans;
    }

    private void process(int[] nums, int start) {
        ans.add(new ArrayList<>(path));

        for (int i = start; i < nums.length; i++) {
            // 同一层 相同的数去掉
            if (i != start && nums[i] == nums[i-1]) continue;
            path.add(nums[i]);
            process(nums,i+1);
            path.removeLast();
        }
    }
    // 慢
/*    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        process(nums, 0);
        Map<List<Integer>,Integer> map = new HashMap<>();
        for (int i = 0; i < ans.size(); i++) {
            if (map.containsKey(ans.get(i))) {
                ans.remove(i);
            }else {
                map.put(ans.get(i),1);
            }
        }

        return ans;
    }

    private void process(int[] nums, int start) {
        ans.add(new ArrayList<>(path));

        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);
            process(nums,i+1);
            path.removeLast();
        }
    }*/
}
