package 数组.长度最小子数组;

/**
 * @title: no209_长度最小的子数组
 * @Author zxwyhzy
 * @Date: 2023/9/12 15:37
 * @Version 1.0
 *
 * 给定一个含有 n 个正整数的数组和一个正整数 target 。
 *
 * 找出该数组中满足其总和大于等于 target 的长度最小的 连续子数组 [numsl, numsl+1, ..., numsr-1, numsr]
 * 并返回其长度。如果不存在符合条件的子数组，返回 0 。
 * https://leetcode.cn/problems/minimum-size-subarray-sum/description/
 *
 */
public class no209_长度最小的子数组 {
    public int minSubArrayLen(int target, int[] nums) {
        // 滑动窗口
        int ans = Integer.MAX_VALUE;
        int l = 0;
        int sum = 0;
        int length = nums.length;
        for (int r = 0; r < length; r++) {
            sum += nums[r];
            // 循环找到最短子数组长度
            while (sum >= target) {
                ans = ans > r - l + 1 ? r - l + 1 : ans;
                sum -= nums[l];
                l++;
            }

        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }

    /**

     public int minSubArrayLen(int target, int[] nums) {
     // 暴力破解
     int ans = Integer.MAX_VALUE;
     for(int i = 0 ;i<nums.length;i++){
     int sum = 0;
     for(int j = i ;j<nums.length;j++){
     sum += nums[j];
     if(sum >= target){
     ans = ans > j-i+1 ? j-i+1:ans ;
     break;
     }

     }
     }
     return ans == Integer.MAX_VALUE ? 0: ans;
     }
     */
}
