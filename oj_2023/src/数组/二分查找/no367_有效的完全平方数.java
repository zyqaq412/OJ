package 数组.二分查找;

/**
 * @title: no367_有效的完全平方数
 * @Author zxwyhzy
 * @Date: 2023/9/12 16:09
 * @Version 1.0
 * 给你一个正整数 num 。如果 num 是一个完全平方数，则返回 true ，否则返回 false 。
 *
 * 完全平方数 是一个可以写成某个整数的平方的整数。换句话说，它可以写成某个整数和自身的乘积。
 *
 * 不能使用任何内置的库函数，如  sqrt 。
 * https://leetcode.cn/problems/valid-perfect-square/description/
 */
public class no367_有效的完全平方数 {
    public boolean isPerfectSquare(int num) {
        int left = 0, right = num;
        while (left <= right) {
            // (right - left) / 2 + left = right/2 - left/2 + left
            // = right/2 + left/2
            // = (right + left)/2
            // 这样写是防止right 和 left都是很大的值相加溢出
            int mid = (right - left) / 2 + left;
            long square = (long) mid * mid;
            if (square < num) {
                left = mid + 1;
            } else if (square > num) {
                right = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
