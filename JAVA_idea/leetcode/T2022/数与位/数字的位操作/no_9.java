package 数与位.数字的位操作;

/**
 * @title: no_9
 * @Author zxwyhzy
 * @Date: 2022/10/20 19:02
 * @Version 1.0
 * 第九题：回文数
 */
public class no_9 {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int rem = 0, y = 0;
        int quo = x;
        while (quo != 0) {
            rem = quo % 10;
            y = y * 10 + rem;
            quo = quo / 10;
        }
        return y == x;
    }
}
