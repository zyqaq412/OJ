package T11_3;

import java.util.Scanner;

/**
 * @title: ZouLangDeDeng
 * @Author zxwyhzy
 * @Date: 2022/11/3 23:32
 * @Version 1.0
 *
 * 链接：https://ac.nowcoder.com/acm/contest/43844/B
 * 来源：牛客网
 *
 * 走廊里一共有一排共 nn 盏灯，其中有的灯是灭的，用 0 表示，有的灯是亮的，用 1 表示，还有的灯是闪烁的，用 2 表示。
 *
 * 最长有多少盏连续的灯不包含亮着的灯或不包含灭了的灯（满足任意一个即可）？
 */
public class ZouLangDeDeng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();


        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < t; i++) {
            int h = sc.nextInt();
            String s= sc.next();
            int max =0;
            int t1=0;
            int t2=0;
            for (int j = 0; j < h; j++) {
                if (s.charAt(j) =='1'){
                    max = max > t2 ? max:t2;
                    t1++;
                    t2=0;

                }else if (s.charAt(j)=='0'){
                    max = max> t1 ? max:t1;
                    t2++;
                    t1=0;

                }else {
                    t1++;
                    t2++;
                }
                /*if (s.charAt(j)!='1')max1=++t1;
                else  t1=0;
                if (s.charAt(j)!='0')max2=++t2;
                else  t2=0;*/
            }
            max = max > Math.max(t1,t2)?max:Math.max(t1,t2);
            sb.append(max).append("\n");
        }
        System.out.println(sb);
    }
}
