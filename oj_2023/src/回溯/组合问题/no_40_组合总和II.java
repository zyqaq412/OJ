package 回溯.组合问题;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @title: no_40_组合总和II
 * @Author zxwyhzy
 * @Date: 2023/10/20 12:51
 * @Version 1.0
 */
public class no_40_组合总和II {
    public static void main(String[] args) {
        new no_40_组合总和II().combinationSum2(new int[]{1,2,1},3);
    }
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates); // 先进行排序
        process(candidates, target, 0, 0);
        return ans;
    }

    private void process(int[] candidates, int target, int sum, int start) {
        if (sum > target) return;
        if (sum == target) {
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            // 去重
            // i > start 说明 i 和 i - 1 是 同一层
            // 而同一层 相同的开始 前面一个的结果会包含后一个的 所以需要跳过
            // 例子： [1,1,2]
            /*
            *       1                   1               2
            *   1       2          2
            * 2         [1,2]   [1,2]
            * */
            if ( i > start && candidates[i] == candidates[i - 1] ) {
                continue;
            }
            path.add(candidates[i]);
            process(candidates, target, candidates[i] + sum, i+1);
            path.remove(path.size()-1);
        }
    }
}
