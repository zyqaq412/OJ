package ACM;

import java.util.Scanner;

/**
 * @title: no_9
 * @Author zxwyhzy
 * @Date: 2023/11/1 12:42
 * @Version 1.0
 * 题目描述
 * 有一天, 小明收到一张奇怪的信, 信上要小明计算出给定数各个位上数字为偶数的和。
 * 例如：5548，结果为12，等于 4 + 8 。
 * 小明很苦恼，想请你帮忙解决这个问题。
 * 输入描述
 * 输入数据有多组。每组占一行，只有一个整整数，保证数字在32位整型范围内。
 * 输出描述
 * 对于每组输入数据，输出一行，每组数据下方有一个空行。
 * 输入示例
 * 415326
 * 3262
 * 输出示例
 * 12
 * <p>
 * 10
 */
public class no_9 {
    class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while (sc.hasNextLine()) {
                /*int tmp = Integer.valueOf(sc.nextLine());
                process(tmp);*/
                String tmp = sc.nextLine();
                process2(tmp);

            }
        }


        private static void process2(String num) {
            char[] nums = num.toCharArray();
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] % 2 == 0){
                    sum+=nums[i] - 48;
                }
            }
            System.out.println(sum);
            System.out.println();
        }

        private static void process(int num) {
            int sum = 0;
            while (num > 0) {
                if (num % 2 == 0) {
                //if ((num & 1) != 1) {
                    sum += num % 10;
                }
                num/=10;
            }
            System.out.println(sum);
            System.out.println();
        }
    }
}
