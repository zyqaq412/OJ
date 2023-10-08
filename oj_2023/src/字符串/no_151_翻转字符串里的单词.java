package 字符串;

/**
 * @title: no_151_翻转字符串里的单词
 * @Author zxwyhzy
 * @Date: 2023/10/8 23:09
 * @Version 1.0
 *
 * 给你一个字符串 s ，请你反转字符串中 单词 的顺序。
 *
 * 单词 是由非空格字符组成的字符串。s 中使用至少一个空格将字符串中的 单词 分隔开。
 *
 * 返回 单词 顺序颠倒且 单词 之间用单个空格连接的结果字符串。
 *
 * 注意：输入字符串 s中可能会存在前导空格、尾随空格或者单词间的多个空格。返回的结果字符串中，单词间应当仅用单个空格分隔，且不包含任何额外的空格。
 */
public class no_151_翻转字符串里的单词 {
    public String reverseWords(String s) {
        char[] ss = s.toCharArray();
        int len = ss.length - 1;
        StringBuilder ans = new StringBuilder();
        for (int i = len; i >= 0; ) {
            if (ss[i] == ' ') {
                i--;
                continue;
            } else {
                StringBuilder temp = new StringBuilder();
                while (i >= 0 && ss[i] != ' ') {
                    temp.append(ss[i]);
                    i--;
                }
                temp.reverse();
                ans.append(temp);
                ans.append(" ");
            }
        }
        ans.deleteCharAt(ans.length()-1);
        return ans.toString();
    }
}
