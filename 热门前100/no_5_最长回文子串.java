public class no_5_最长回文子串 {

}

class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2)
            return s;
        char[] chr = s.toCharArray();

        // dp[i][j] 代表i-j是回文串
        boolean[][] dp = new boolean[len][len];
        // 回文串开始下标 和 回文串长度 默认1
        int begin = 0;
        int maxLen = 1;
        for (int j = 1; j < len; j++) {
            for (int i = 0; i < j; i++) {


                // 优化判断  78ms
                if (chr[i] == chr[j] && (j - i + 1 <= 3 || dp[i + 1][j - 1])) {
                    dp[i][j] = true;
                    // 记录最长字串的开始下标和长度
                    if (j - i + 1 > maxLen) {
                        maxLen = j - i + 1;
                        begin = i;
                    }
                } else {
                    dp[i][j] = false;
                }

                // 81ms

                /* if (chr[i] == chr[j]) {
                    // 左右相等且长度小于等于3一定是回文串  j-i+1<=3 == j-i<3
                    if (j - i+1 <= 3)
                        dp[i][j] = true;
                    else
                    // 长度大于3 中间的是回文串 就也是回文串
                        dp[i][j] = dp[i + 1][j - 1];
                    if (dp[i][j] && j - i + 1 > maxLen) {
                        maxLen = j - i + 1;
                        begin = i;
                    }
                } else {
                    dp[i][j] = false;
                } */

            }
        }

        return s.substring(begin, begin + maxLen);
    }
}