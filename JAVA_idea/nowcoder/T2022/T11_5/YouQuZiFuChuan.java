package T11_5;

import java.util.Scanner;

/**
 * @title: YouQuZiFuChuan
 * @Author zxwyhzy
 * @Date: 2022/11/5 14:59
 * @Version 1.0
 * 链接：https://ac.nowcoder.com/acm/contest/45958/C
 * 来源：牛客网
 *
 * Liser同学最近迷上了处理字符串，发现每段字符串都有自己的规律，例如：”abbvc”,a 出现一次，b 出现俩次，v 出现一次，c 出现一次。
 * b 出现的次数最多，第一个只出现一次的为 a，依次类推，Laker觉得Liser对字符串的兴趣很大，
 * 于是给出了这样一个问题：“输入一个字符串 ”abbvc” 和数字 3，该字符串就会向左移三位变成 ”vcabb”，
 * 也就是说将字符串前面的前三个字符转移到字符串尾部”，Liser仔细想了想，发现很好写，于是你能帮Liser完成这个问题吗？
 */
public class YouQuZiFuChuan {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();
        int a = sc.nextInt();
        if (a == s.length()){
            System.out.println(s);
        }else if (a>0&&a<s.length()){
            String s1 = s.substring(0, a);
            String s2 = s.substring(a);
            System.out.println(s2+s1);
        }else {
            System.out.println();
        }

    }
    /*String s = sc.nextLine();
        int a = sc.nextInt();
        int c = s.length();
        if (a > c || a<0) return;
        StringBuffer sb = new StringBuffer();
        for (int i = a ; c > 0; c--) {
            sb.append(s.charAt(i));
            i = (++i%s.length());
        }
        System.out.println(sb);*/
}
