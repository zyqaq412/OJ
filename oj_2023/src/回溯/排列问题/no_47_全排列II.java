package 回溯.排列问题;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @title: no_46_全排列II
 * @Author zxwyhzy
 * @Date: 2023/10/31 15:41
 * @Version 1.0
 */
public class no_47_全排列II {
    List<List<Integer>> ans = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    boolean[] bool;

    public List<List<Integer>> permuteUnique(int[] nums) {
        bool = new boolean[nums.length];
        Arrays.sort(nums);
        process(nums);
        return ans;
    }


    private void process(int[] nums) {
        if (path.size() == nums.length) {
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            // 每个位置的数只能用一次
            if (bool[i]) continue;
            // ! bool[i - 1] == (bool[i-1] == false) 表示 i 是一层的开始
            // 每一层 相同的数字只取一次
            if (i != 0  && nums[i] == nums[i - 1] && ! bool[i - 1]) continue;
            bool[i] = true;
            path.add(nums[i]);
            process(nums);
            path.removeLast();
            bool[i] = false;
        }
    }
}
