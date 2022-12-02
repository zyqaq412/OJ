package 字符串;

/**
 * @title: no_434_字符串中的单词数
 * @Author zxwyhzy
 * @Date: 2022/12/2 23:15
 * @Version 1.0
 */
public class no_434_字符串中的单词数 {

    public static void main(String[] args) {
        String s = "love live! mu'sic forever";
        System.out.println(new no_434_字符串中的单词数().countSegments(s));


    }
    public int countSegments(String s) {
        int segmentCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((i == 0 || s.charAt(i - 1) == ' ') && s.charAt(i) != ' ') {
                segmentCount++;
            }
        }

        return segmentCount;
    }

}
