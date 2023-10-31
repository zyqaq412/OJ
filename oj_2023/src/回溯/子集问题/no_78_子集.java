package 回溯.子集问题;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @title: no_78_子集
 * @Author zxwyhzy
 * @Date: 2023/10/31 13:25
 * @Version 1.0
 */
public class no_78_子集 {
    List<List<Integer>> ans = new ArrayList<>();
    // List<Integer> path = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> subsets(int[] nums) {
        process(nums, 0);
        return ans;
    }

    private void process(int[] nums, int start) {
        ans.add(new ArrayList<>(path));
        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);
            process(nums, i + 1);
            // path.remove(path.size() - 1);
            path.removeLast();
        }
    }
}
