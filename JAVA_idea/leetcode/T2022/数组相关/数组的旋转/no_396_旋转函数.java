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


    public int maxRotateFunction2(int[] nums) {
        int sum = 0, curSum = 0, ans = 0;
        for (int i = 0; i < nums.length; ++i){sum += nums[i]; curSum += i * nums[i];}
        ans = curSum;
        for (int i = nums.length - 1; i > 0; --i) {
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
