package ACM;

import java.util.Scanner;

/**
 * @title: km_10
 * @Author zxwyhzy
 * @Date: 2023/11/1 12:59
 * @Version 1.0
 * <p>
 * 题目描述
 * 小明每天的话费是1元，运营商做活动，手机每充值K元就可以获赠1元话费，一开始小明充值M元，问最多可以用多少天？ 注意赠送的话费也可以参与到奖励规则中
 * 输入描述
 * 输入包括多个测试实例。每个测试实例包括2个整数M，K（2<=k<=M<=1000)。M=0，K=0代表输入结束。
 * 输出描述
 * 对于每个测试实例输出一个整数，表示M元可以用的天数。
 * 输入示例
 * 2 2
 * 4 3
 * 13 3
 * 0 0
 * 输出示例
 * 3
 * 5
 * 19
 * 提示信息
 * 注意第三组数据「13 3」结果为什么是19呢， 13/3=4，获得4元奖励。
 * 13%3=1，还剩下1元，4+1=5，5元继续参加奖励规则。
 * 5/3=1，获得1元奖励。 5%3=2，剩下2元，1+2=3，3元继续参与奖励规则。
 * 3/3=1，获得1元奖励。 3%3=0，剩下0元，1+0=1。 1元不能参与剩下奖励。
 * 所以一共可以使用的天数是 13+4+1+1=19
 */
public class km_10 {
    class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while (sc.hasNext()) {
                int M = sc.nextInt();
                int K = sc.nextInt();
                if (M == 0 && K == 0) return;
                process(M, K);
            }
        }

        /**
         * @param M 充值
         * @param K 每k元送1元
         */
        private static void process(int M, int K) {
            int tmp_m = M;
            while (tmp_m >= K) {
                int zs = tmp_m / K;
                M += zs;
                tmp_m %= K;
                tmp_m += zs;
            }
            System.out.println(M);
        }
    }
}
