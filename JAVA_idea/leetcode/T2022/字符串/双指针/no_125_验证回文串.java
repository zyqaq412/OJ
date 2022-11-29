package 字符串.双指针;

/**
 * @title: no_125_验证回文串
 * @Author zxwyhzy
 * @Date: 2022/11/29 20:34
 * @Version 1.0
 */
public class no_125_验证回文串 {

    public static void main(String[] args) {
        //String s = "A man, a plan, a canal: Panama";
        String s = "`l;`` 1o1 ??;l`";
        //String s = "aaa,,,9090   adda";
        /*s = s.replaceAll("\\d|\\p{P}|\\s","");
        System.out.println(s);*/
        System.out.println(new no_125_验证回文串().isPalindrome(s));
    }


    /*
     * @Date: 2022/11/29 21:10
     * 如果在将所有大写字符转换为小写字符、并移除所有非字母数字字符之后，短语正着读和反着读都一样。则可以认为该短语是一个 回文串 。
    字母和数字都属于字母数字字符。
    给你一个字符串 s，如果它是 回文串 ，返回 true ；否则，返回 false 。
     */
    public boolean isPalindrome(String s) {
        // \d 匹配数字  p{P}匹配符号  \s匹配空白字符
        //s = s.replaceAll("\\d|\\p{P}|\\s", "");
        //数字不移除
        s = s.replaceAll("\\p{P}|\\s|`", "");
        //转换为小写
        if (s.length()<1) return true;
        s = s.toLowerCase();
        System.out.println(s);
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            //charAt(int index)  //返回指定索引的 char值
            if (!(s.charAt(left) == s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
