import java.util.Arrays;

/**
 * @title: no_34_在排序数组中查找元素的第一个和最后一个位置
 * @Author zxwyhzy
 * @Date: 2023/5/25 20:28
 * @Version 1.0
 * 给你一个按照非递减顺序排列的整数数组 nums，和一个目标值 target。请你找出给定目标值在数组中的开始位置和结束位置。
 * 如果数组中不存在目标值 target，返回[-1, -1]。
 * 你必须设计并实现时间复杂度为O(log n)的算法解决此问题。
 */
public class no_34_在排序数组中查找元素的第一个和最后一个位置 {
    class Solution {
        public int[] searchRange(int[] nums, int target) {

            int N = nums.length;
            int begin = 0;
            int end = N - 1;
            int mid;
            int[] res = new int[2];
            Arrays.fill(res, -1);
            // 先二分查找到目标值
            while (begin <= end) {
                mid = (begin + end) >> 1;
                if (nums[mid] == target) {
                    // 找到值后左右遍历寻找边界
                    int temp = mid;
                    while (--temp >= 0) {
                        if (nums[temp] != nums[mid]) {
                            break;
                        }
                    }
                    res[0] = ++temp;
                    temp = mid;
                    while (++temp < N) {
                        if (nums[temp] != nums[mid]) {
                            break;
                        }
                    }
                    res[1] = --temp;
                    break;
                } else if (nums[mid] < target) {
                    begin = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            return res;
        }
    }
}
