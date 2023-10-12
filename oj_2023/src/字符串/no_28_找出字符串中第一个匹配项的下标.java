package 字符串;

/**
 * @title: no_28_找出字符串中第一个匹配项的下标
 * @Author zxwyhzy
 * @Date: 2023/10/10 23:28
 * @Version 1.0
 * 给你两个字符串 haystack 和 needle ，
 * 请你在 haystack 字符串中找出 needle 字符串的第一个匹配项的下标（下标从 0 开始）。
 * 如果 needle 不是 haystack 的一部分，则返回  -1 。
 */
public class no_28_找出字符串中第一个匹配项的下标 {





    // BF 优化
    public int strStr2(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        if (n < m) return -1;
        // i<= n-m : 最大的开始位置，再大长度不管比了
        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == m) {
                return i;
            }
        }
        return -1;
    }



    // BF
    public int strStr1(String haystack, String needle) {
        if (haystack.length() < needle.length()) return -1;
        int l1 = 0;
        while (l1 < haystack.length()) {
            int l2 = 0;
            while (l1<haystack.length() && l2 < needle.length() && haystack.charAt(l1) == needle.charAt(l2)) {
                l1++;
                l2++;
            }
            if (l2 == needle.length()) {
                return l1 - l2;
            }
            if (l1 == haystack.length()) return -1;
            l1 = l1 - l2 + 1;
        }
        return l1 == haystack.length() ? -1 : l1;
    }
}
