package 字符串;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @title: no_412_FizzBuzz
 * @Author zxwyhzy
 * @Date: 2023/2/8 23:35
 * @Version 1.0
 * 给你一个整数 n ，找出从 1 到 n 各个整数的 Fizz Buzz 表示，并用字符串数组 answer（下标从 1 开始）返回结果，其中：
 *
 * answer[i] == "FizzBuzz" 如果 i 同时是 3 和 5 的倍数。
 * answer[i] == "Fizz" 如果 i 是 3 的倍数。
 * answer[i] == "Buzz" 如果 i 是 5 的倍数。
 * answer[i] == i （以字符串形式）如果上述条件全不满足。
 */
public class no_412_FizzBuzz {
    public List<String> fizzBuzz(int n) {
        String[] answer = new String[n];

        for (int i = 1; i < n+1; i++) {
            if (i % 3 == 0 && i % 5 ==0){
                answer[i-1] = "FizzBuzz";
            }else if (i % 3 == 0){
                answer[i-1] = "Fizz";
            }else if (i % 5 ==0){
                answer[i-1] = "Buzz";
            }else {
                answer[i-1] = i+"";
            }
        }
        return Arrays.asList(answer);
    }
}
