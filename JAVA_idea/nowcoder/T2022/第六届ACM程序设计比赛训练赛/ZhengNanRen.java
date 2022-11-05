package 第六届ACM程序设计比赛训练赛;

import java.util.Scanner;

/**
 * @title: ZhengNanRen
 * @Author zxwyhzy
 * @Date: 2022/11/5 15:50
 * @Version 1.0
 *
 * 链接：https://ac.nowcoder.com/acm/contest/45958/F
 * 来源：牛客网
 *
 * 小张在玩单机游戏的时候遇到这样一款游戏，游戏和我们平时玩的上100层差不多。游戏由两行n列构成的，
 * 每一行上有n个木板，游戏通关条件是从（1，1）点跳到（2，n）点。每次可以跳到下一层的两块木板中的任一一块，
 * 也就是说可以从 (x1,y1) 到(x2,y2) 的条件是 |x1−x2|≤1 且| y1−y2|≤1。其中有些地方是有陷阱的，有陷阱的地方是不能到达的，
 * 现在小张知道那些木板是有陷阱的，他想知道能不能通关。
 * 其中：0代表安全，1代表有陷阱。
 */
public class ZhengNanRen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int[][] c = new int[2][i];
        for (int j = 0; j < i; j++) {
            int j1 = sc.nextInt();
            c[0][j] = j1;
        }
        for (int j = 0; j < i; j++) {
            int j2 = sc.nextInt();
            c[1][j] = j2;
        }
        for (int j = 0; j < i; j++) {
            if (c[0][j]==1 && c[1][j]==1){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
