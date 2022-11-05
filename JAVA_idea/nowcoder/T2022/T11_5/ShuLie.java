package T11_5;

import java.util.Scanner;

/**
 * @title: ShuLie
 * @Author zxwyhzy
 * @Date: 2022/11/5 15:35
 * @Version 1.0
 *
 * 链接：https://ac.nowcoder.com/acm/contest/45958/B
 * 来源：牛客网
 *
 * 移通学院以各式各样的活动来促成我们的全面发展，如果你成为了某部门的部长，你会需要管理你部门的n个干事，
 * 由于每个干事的个人能力不同，所能完成的工作也不同，如果我们给每个干事设定一项“能力值”表示某干事的能力，
 * 为了方便管理我们将干事的能力从小到大排序。
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
