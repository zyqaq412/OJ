package 数与位.位运算;

import java.util.stream.Stream;

/**
 * @title: no_2595_奇偶位数
 * @Author zxwyhzy
 * @Date: 2023/3/25 21:37
 * @Version 1.0
 */
public class no_2595_奇偶位数 {

    public static void main(String[] args) {
        int[] ints = new no_2595_奇偶位数().evenOddBit(2);

        for (int anInt : ints) {
            System.out.print(anInt+" ");
        }

    }

    public int[] evenOddBit(int n) {
        String s = Integer.toBinaryString(n);
        int length = s.length();
        int even=0,odd=0;
        int[] answer = {even,odd};
        for (int i = 0; i < length; i++) {
            // 10000 最右边下标位1
            if (s.charAt(length - i - 1) == '1'){
                if (i%2 == 0) answer[0]++;
                else answer[1]++;
            }
        }
        return answer;
    }
}
