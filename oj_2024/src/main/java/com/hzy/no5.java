package com.hzy;

/**
 * @title: no5
 * @Author zxwyhzy
 * @Date: 2024/2/4 16:58
 * @Version 1.0
 */
public class no5 {

    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2) return s;
        char[] chs = s.toCharArray();
        boolean[][] dp = new boolean[len][len];
        int startIndex = 0;
        int maxLen = 1;
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if (chs[i] == chs[j] && ((i - j + 1 <= 3) || dp[i - 1][j + 1])) {
                    dp[i][j] = true;
                    if (i - j + 1 > maxLen) {
                        maxLen = i - j + 1;
                        startIndex = j;
                    }
                } else {
                    dp[i][j] = false;
                }
            }
        }
        return s.substring(startIndex, startIndex + maxLen);
    }
}
