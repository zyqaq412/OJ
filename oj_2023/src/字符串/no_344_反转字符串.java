package 字符串;

/**
 * @title: no_344_反转字符串
 * @Author zxwyhzy
 * @Date: 2023/10/8 22:29
 * @Version 1.0
 */
public class no_344_反转字符串 {
    public void reverseString(char[] s) {
        int l = 0, r = s.length - 1;
        while (l < r) {
            s[l] += s[r];
            s[r] = (char) (s[l] - s[r]);
            s[l] -= s[r];
            l++;
            r--;
        }
    }
}
