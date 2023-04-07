package 牛客小白月赛70;

import java.util.Scanner;
import java.util.Stack;

/**
 * @title: 小d答案修改
 * @Author zxwyhzy
 * @Date: 2023/4/7 19:24
 * @Version 1.0
 */
public class 小d答案修改 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()){
            String str = s.nextLine();
            System.out.println(t(str));

        }
    }
    public static String t(String str){
        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
           if (chars[i] >=65 && chars[i]<=90) chars[i] += 32;
           else chars[i] -= 32;
        }
        return String.valueOf(chars);
    }
}
