package com.hzy;

/**
 * @title: no10
 * @Author zxwyhzy
 * @Date: 2024/2/4 20:29
 * @Version 1.0
 */
public class no10 {

    public static void main(String[] args) {
        System.out.println(new no10().isMatch("abccd", "abc*d"));
    }
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        // 创建动态规划数组，dp[i][j] 表示 s 的前 i 个字符和 p 的前 j 个字符是否匹配
        boolean[][] dp = new boolean[m + 1][n + 1];
        // 初始化，空字符串和空正则表达式是匹配的
        dp[0][0] = true;
        // 处理正则表达式中的 '*'，初始化第一行
        for (int j = 1; j <= n; j++) {
            if (p.charAt(j - 1) == '*') {
                // '*' 匹配零个前面的元素
                dp[0][j] = dp[0][j - 2];
            }
        }
        // 填充动态规划数组
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                char sc = s.charAt(i - 1);
                char pc = p.charAt(j - 1);
                // 如果当前字符匹配，即 '.' 或者与当前字符相同
                if (pc == '.' || pc == sc) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (pc == '*') {
                    // 处理 '*' 的情况，分为匹配零个和匹配一个或多个
                    dp[i][j] = dp[i][j - 2] || (dp[i - 1][j] && (s.charAt(i - 1) == p.charAt(j - 2) || p.charAt(j - 2) == '.'));
                }
            }
        }

        // 最终结果为 dp[m][n]
        return dp[m][n];
    }
}
