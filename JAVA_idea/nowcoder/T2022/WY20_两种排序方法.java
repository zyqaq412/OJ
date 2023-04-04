import java.util.Scanner;

/**
 * @title: WY20_两种排序方法
 * @Author zxwyhzy
 * @Date: 2023/4/4 18:21
 * @Version 1.0
 */
public class WY20_两种排序方法 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int n = in.nextInt();
        String[] strs = new String[n];
        in.nextLine();
        for (int i = 0; i < strs.length; i++) {
            strs[i] = in.nextLine();
        }

        if (isLexicographically(strs) && isLengths(strs))System.out.println("both");
        else if (isLexicographically(strs))System.out.println("lexicographically");
        else if (isLengths(strs))System.out.println("lengths");
        else System.out.println("none");

    }
    public static boolean isLexicographically(String[] s) {
        for (int i = 1; i < s.length; i++) {
            if (s[i - 1].compareTo(s[i]) > 0) return false;
        }
        return true;
    }
    public static boolean isLengths(String[] s) {
        for (int i = 1; i < s.length; i++) {
            if (s[i - 1].length() > s[i].length()) return false;
        }
        return true;
    }
}
