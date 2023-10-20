package 回溯.组合问题;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @title: no_39_组合总和
 * @Author zxwyhzy
 * @Date: 2023/10/20 12:31
 * @Version 1.0
 * 给你一个 无重复元素 的整数数组 candidates 和一个目标整数 target ，
 * 找出 candidates 中可以使数字和为目标数 target 的 所有 不同组合 ，并以列表形式返回。你可以按 任意顺序 返回这些组合。
 * candidates 中的 同一个 数字可以 无限制重复被选取 。如果至少一个数字的被选数量不同，则两种组合是不同的。
 * 对于给定的输入，保证和为 target 的不同组合数少于 150 个。
 */
public class no_39_组合总和 {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        process(candidates, target, 0, 0);
        Arrays.sort(candidates); // 先进行排序
        return ans;
    }

    private void process(int[] candidates, int target, int sum, int start) {
         if (sum > target) return;
        if (sum == target) {
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            path.add(candidates[i]);
            process(candidates, target, candidates[i] + sum, i);
            path.remove(path.size()-1);
        }
    }
}
