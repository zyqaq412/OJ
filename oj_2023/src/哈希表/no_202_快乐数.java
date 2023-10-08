package 哈希表;

import java.util.HashSet;

/**
 * @title: no_202_快乐数
 * @Author zxwyhzy
 * @Date: 2023/10/8 21:57
 * @Version 1.0
 * 编写一个算法来判断一个数 n 是不是快乐数。
 * <p>
 * 「快乐数」 定义为：
 * <p>
 * 对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和。
 * 然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。
 * 如果这个过程 结果为 1，那么这个数就是快乐数。
 * 如果 n 是 快乐数 就返回 true ；不是，则返回 false 。
 */
public class no_202_快乐数 {
    public static void main(String[] args) {
        new no_202_快乐数().isHappy(19);
    }
    public boolean isHappy(int n) {
        HashSet<Integer> hs = new HashSet<>();
        int sum = n;
        while (sum != 1) {
            sum = count(sum);
            if (hs.contains(sum)) return false;
            hs.add(sum);
        }
        return true;

    }

    private int count(int n) {
        int sum = 0;
        while (n > 0) {
            int temp = n % 10;
            n /= 10;
            sum += temp * temp;
        }
        return sum;
    }
}
