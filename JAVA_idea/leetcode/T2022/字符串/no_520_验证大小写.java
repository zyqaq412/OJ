package 字符串;

import org.omg.CORBA.StringHolder;

/**
 * @title: no_520_验证大小写
 * @Author zxwyhzy
 * @Date: 2022/11/27 18:40
 * @Version 1.0
 */
public class no_520_验证大小写 {

    public static void main(String[] args) {
        String word = "FlaG";
        System.out.println(new no_520_验证大小写().detectCapitalUse(word));
    }

    public boolean detectCapitalUse(String word) {
        char[] chars = word.toCharArray();
        int a = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z' ){
                a++;
            }
        }
        if (a == chars.length) return true;
        if (a == 0) return  true;
        if (a == 1 && chars[0] >= 'A' && chars[0] <='Z') return true;
        return false;
    }
}
