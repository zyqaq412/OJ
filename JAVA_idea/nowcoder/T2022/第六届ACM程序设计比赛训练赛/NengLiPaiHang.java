package 第六届ACM程序设计比赛训练赛;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @title: NengLiPaiHang
 * @Author zxwyhzy
 * @Date: 2022/11/5 14:43
 * @Version 1.0
 *
 * 移通学院以各式各样的活动来促成我们的全面发展，如果你成为了某部门的部长，你会需要管理你部门的n个干事，
 *  * 由于每个干事的个人能力不同，所能完成的工作也不同，如果我们给每个干事设定一项“能力值”表示某干事的能力，
 *  * 为了方便管理我们将干事的能力从小到大排序。
 */
public class NengLiPaiHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        long[] ls = new long[i];
        long temp;
        for (int j = 0; j < i; j++) {
            temp = sc.nextLong();
            ls[j] = temp;
        }
        Arrays.sort(ls);
        for (long l : ls) {
            System.out.println(l);
        }
    }
}
