package 数组相关.数组的旋转;

import java.util.Arrays;

/**
 * @title: no_396_旋转函数
 * @Author zxwyhzy
 * @Date: 2022/11/8 23:38
 * @Version 1.0
 */
public class no_396_旋转函数 {
    public static void main(String[] args) {
        int[] nums = new int[]{4,3,2,6};
        new no_396_旋转函数().maxRotateFunction(nums);
        int[] nums1 = {1,2,3,4,5};
        int sum = Arrays.stream(nums1).sum();
        System.out.println(sum);
    }




    /*
    给定一个长度为 n 的整数数组 nums 。
    假设 arrk 是数组 nums 顺时针旋转 k 个位置后的数组，我们定义 nums 的 旋转函数  F 为：
    F(k) = 0 * arrk[0] + 1 * arrk[1] + ... + (n - 1) * arrk[n - 1]
    返回 F(0), F(1), ..., F(n-1)中的最大值 。
    生成的测试用例让答案符合 32 位 整数。
     */
    public int maxRotateFunction2(int[] nums) {
        // sum 数组和    curSum 数组系数乘积和  ans 最大数
        int sum = 0, curSum = 0, ans = 0;
        for (int i = 0; i < nums.length; ++i){
            sum += nums[i];
            curSum += i * nums[i];
        }
        ans = curSum;
        for (int i = nums.length - 1; i > 0; --i) {
            /*
                每次变化后的 乘积和 数组最后一个数的系数变为0 其他的系数加1
                乘积和 = 上一个乘积和 + 数组和 - ((n - 1) * arrk[n - 1]) - (数组和里面的arrk[n - 1])
                      = 上一个乘积和 + 数组和 - n*arrk[n - 1]
            */
            curSum += sum - nums.length * nums[i];
            ans = Math.max(ans, curSum);
        }
        return ans;
    }


    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for (int i = n; i > 0; i--) {
            int sum = 0;
            for (int j = n; j > 0; j--) {
                sum += nums[(j+i-1)%n]*(j-1);
            }
            max = max > sum ? max : sum;
        }
        return max;
    }
}
