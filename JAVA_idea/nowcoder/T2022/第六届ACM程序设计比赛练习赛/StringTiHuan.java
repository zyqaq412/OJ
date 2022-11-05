package 第六届ACM程序设计比赛练习赛;

import java.util.Scanner;

/**
 * @title: StringTiHuan
 * @Author zxwyhzy
 * @Date: 2022/10/29 18:39
 * @Version 1.0
 *
 * 重庆移通学院第六届ACM程序设计比赛练习赛
 *  * 链接：https://ac.nowcoder.com/acm/contest/43885/C
 *  * 来源：牛客网
 */
public class StringTiHuan {
    static String dontlike = "dontlike";
    static String hate = "hate";
    static String dislike = "dislike";
    static String distinguishing = "distinguishing";

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());

        String s = sc.nextLine();
        String str = s.substring(0, a);
        //替换字母加个，防止替换后和前面的字母又组成被替换单词 例：disdontlike  dontlike--》like  和dis组成dislike再次被替换
        if (str.contains("dontlike")) str = str.replaceAll("dontlike", "li,ke");
        if (str.contains("hate")) str = str.replaceAll("hate", "lo,ve");
        if (str.contains("dislike")) str = str.replaceAll("dislike", "li,ke");
        if (str.contains("distinguishing")) str = str.replaceAll("distinguishing", "e,xciting");
        StringBuffer str1 = new StringBuffer();
        //去掉","
        String[] a1 = str.split(",");
        for (int i = 0; i < a1.length; i++) {
            str1.append(a1[i]);
        }
        System.out.println(str1);
    }
}
