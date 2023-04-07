package 剑指offer;

/**
 * @title: II068_查找插入位置
 * @Author zxwyhzy
 * @Date: 2023/4/7 20:12
 * @Version 1.0
 * 给定一个排序的整数数组 nums和一个整数目标值 target ，请在数组中找到target，并返回其下标。
 * 如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 请必须使用时间复杂度为 O(log n) 的算法。

 */
public class II068_查找插入位置 {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int mid = 0;
        // 记录最后一次判断 nums[mid] 和 target谁大谁小
        int tag = 0;
        while(left <= right){
            mid = (left+right)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) {
                right = mid-1;
                tag = 1;
            }
            else {
                left = mid+1;
                tag = 2;
            }
        }
        return tag == 2 ? mid+1:mid;
    }
}
