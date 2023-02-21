package 双指针.对撞指针;

/**
 * @title: no_345_反转字符串中的元音字母
 * @Author zxwyhzy
 * @Date: 2023/2/21 15:40
 * @Version 1.0
 * 给你一个字符串 s ，仅反转字符串中的所有元音字母，并返回结果字符串。
 * <p>
 * 元音字母包括 'a'、'e'、'i'、'o'、'u'，且可能以大小写两种形式出现不止一次。
 */
public class no_345_反转字符串中的元音字母 {
    public static void main(String[] args) {
       new no_345_反转字符串中的元音字母().reverseVowels("hello");

    }
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int l, r;
        l = 0;
        r = s.length() - 1;
        while (l < r) {
            while (!panDuan(chars[l])&&l<r) l++;
            while (!panDuan(chars[r])&&l<r) r--;
            char c = chars[l];
            chars[l] = chars[r];
            chars[r] = c;
            l++;
            r--;
        }

        return String.valueOf(chars);
    }

    public boolean panDuan(char c) {
        if ((c=='a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                ||c == 'A' || c == 'E' || c == 'I' ||c == 'O' || c == 'U') return true;
        else return false;
    }
}
