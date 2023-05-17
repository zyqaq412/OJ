/**
 * @title: no_70_爬楼梯
 * @Author zxwyhzy
 * @Date: 2023/5/17 22:42
 * @Version 1.0
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 */
public class no_70_爬楼梯 {

    static class Solution {
        // 暴力递归
        public int climbStairs(int n) {
            return f(n, 1) + f(n, 2);
        }

        public int f(int n, int t) {
            if (n - t < 0)
                return 0;
            else if (n - t == 0) {
                return 1;
            } else {
                return f(n - t, 1) + f(n - t, 2);
            }
        }
        // 根据暴力递归修改的记忆化搜索
        public int climbStairs2(int n) {
            int[] cache = new int[n + 1];
            return f(n, 1, cache) + f(n, 2, cache);
        }

        public int f(int n, int t, int[] cache) {
            if (n - t < 0)
                return 0;
            else if (n - t == 0) {
                return 1;
            } else {
                if (cache[n - t] != 0) {
                    return cache[n - t];
                }
                int result = f(n - t, 1, cache) + f(n - t, 2, cache);
                cache[n - t] = result;
                return result;
            }
        }

        // 动态规划
        public int dp(int n) {
            if (n == 1) return 1;
            if (n == 2) return 2;
            int[] dp = new int[n + 1];
            dp[1] = 1;
            dp[2] = 2;
            for (int i = 3; i <= n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
            return dp[n];
        }
    }
}
