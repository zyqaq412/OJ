package T11_5;

import java.util.Scanner;

/**
 * @title: ShuLie
 * @Author zxwyhzy
 * @Date: 2022/11/5 15:35
 * @Version 1.0
 *
 * 链接：https://ac.nowcoder.com/acm/contest/45958/D
 * 来源：牛客网
 *
 * Laker同学和Liser同学在课堂上学习了高斯求和，也就是1 + 2 + 3 + 4 + 5  + ... + n 求和。
 * Laker觉得这样的数列求和很简单，想考考Liser，问：“Sn = 1 + 1/2 + 1/3 + 1/4 + ... + 1/n。
 * 对于任意的一个整数 m，当 n 足够大的时候，Sn  >  m。现在给出一个整数 m，求满足条件的最小 n，使得  Sn > m”。
 *
 *
 */
public class ShuLie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        double n = 1.0;
        double sum = 0.0;
        sum = sum + 1.0/n;
        while (sum <= m){
            sum = sum + 1.0/++n;
        }
        System.out.println((int)(n));
    }
}
