package 回溯.组合问题;

import java.util.ArrayList;
import java.util.List;

/**
 * @title: no_77_组合
 * @Author zxwyhzy
 * @Date: 2023/10/20 11:37
 * @Version 1.0
 */
public class no_77_组合 {
    public static void main(String[] args) {
        new no_77_组合().combine(4, 2);
    }

    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        process(n, k, 1);
        return ans;
    }

    private void process(int n, int k, int s) {
        if (path.size() == k) {
            ans.add(path.stream().toList());
            return;
        }
        // for (int  i = s ;i<=n;i++){
        // 优化 剪枝
        // 如果for循环选择的起始位置之后的元素个数 已经不足 我们需要的元素个数了，那么就没有必要搜索了
        for (int i = s; i <= n - (k - path.size()) + 1; i++) {
            path.add(i);
            process(n, k, i + 1);
            path.remove(path.size() - 1);
        }
    }
}
