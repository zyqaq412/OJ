package 字符串;

/**
 * @title: no_459_重复的子字符串
 * @Author zxwyhzy
 * @Date: 2023/10/11 22:34
 * @Version 1.0
 */
public class no_459_重复的子字符串 {


    public boolean repeatedSubstringPattern(String s) {
        // String str = s + s;
        // 使用contains() 比较速度慢
        // return str.substring(1, str.length() - 1).contains(s); // 80ms 以上
        int[] next = buildNext(s);
        int len = s.length();
        if (next[len-1] > 0 && len % (len - next[len-1]) == 0) return true; // 10ms 以下
        return false;
    }

    // aabaaf
    // 010120
    public int[] buildNext(String str) {
        char[] s = str.toCharArray();
        int[] next = new int[s.length];
        next[0] = 0;
        int j = 0; // 前缀末尾 也是 前缀长
        for (int i = 1; i < s.length; i++) {
            while (j > 0 && s[j] != s[i]) {
                // 回溯到上一个相同前缀的位置
                j = next[j - 1];
            }
            if (s[j] == s[i]) {
                j++;
            }
            // 前i个字符，前后缀重复j个字符
            next[i] = j;
        }
        return next;
    }
}
