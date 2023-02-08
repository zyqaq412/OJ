package 数组相关.数组遍历;

/**
 * @title: no_1480_一维数组的动态和
 * @Author zxwyhzy
 * @Date: 2023/2/8 22:47
 * @Version 1.0
 *
 * 给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。
 *
 * 请返回 nums 的动态和。
 *
 *
 */
public class no_1480_一维数组的动态和 {
    public int[] runningSum(int[] nums) {
        int[] r = new int[nums.length];
        int temp =0;
        for (int i = 0; i < nums.length; i++) {
            temp = nums[i] + temp;
            r[i] = temp;
        }
        return r;
    }
}
