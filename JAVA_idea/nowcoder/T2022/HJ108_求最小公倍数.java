import java.util.Scanner;

/**
 * @title: HJ108_求最小公倍数
 * @Author zxwyhzy
 * @Date: 2023/4/4 15:03
 * @Version 1.0
 */
public class HJ108_求最小公倍数 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            int b = in.nextInt();

            int c = a * b;
            for (int i = Math.max(a, b); i <= c; i += Math.max(a, b)) {
                if (i % a == 0 && i % b == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
