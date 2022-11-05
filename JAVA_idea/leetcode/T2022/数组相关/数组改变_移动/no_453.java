package 数组相关.数组改变_移动;

import java.util.Arrays;

/**
 * @title: no_453
 * @Author zxwyhzy
 * @Date: 2022/10/31 22:32
 * @Version 1.0
 *
 * 给你一个长度为 n 的整数数组，每次操作将会使 n - 1 个元素增加 1 。返回让数组所有元素相等的最小操作次数。
 *
 */
public class no_453 {
    public int minMoves(int[] nums) {
       int min =  Arrays.stream(nums).min().getAsInt();//取最小值
        //n-1 个数加1 相当于 1 个数减一
        //计算所有大于最小数的数 减1到最小数 的次数和
        int sum = 0;
        for (int num : nums) {
            sum+= num-min;

        }
        return sum;
    }
}
