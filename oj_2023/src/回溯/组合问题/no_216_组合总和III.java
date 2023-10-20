package 回溯.组合问题;

import java.util.ArrayList;
import java.util.List;

/**
 * @title: no_216_组合总和III
 * @Author zxwyhzy
 * @Date: 2023/10/20 12:10
 * @Version 1.0
 */
public class no_216_组合总和III {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        process(k,n,1,0);
        return ans;
    }
    private void process(int k, int n,int start,int sum){
        if (sum > n) return; // 剪枝
        if (k == path.size()){
            if (sum == n) ans.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < 10; i++) {
            path.add(i);
            process(k,n,i+1,i+sum);
            path.remove(path.size()-1);
        }
    }
}
