package 数组.二分查找;

/**
 * @title: no704_二分查找
 * @Author zxwyhzy
 * @Date: 2023/9/12 16:06
 * @Version 1.0
 *
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 * https://leetcode.cn/problems/binary-search/description/
 */
public class no704_二分查找 {
    public int search(int[] nums, int target) {
        int right = nums.length;
        int left = 0;
        int mid = 0;
        while(left < right){
            mid = (left + right) / 2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else {
                right = mid;
            }

        }
        return -1;
    }
}
