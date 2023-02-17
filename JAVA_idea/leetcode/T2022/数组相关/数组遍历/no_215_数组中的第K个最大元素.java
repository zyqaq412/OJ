package 数组相关.数组遍历;

import java.util.Arrays;

/**
 * @title: no_215_数组中的第K个最大元素
 * @Author zxwyhzy
 * @Date: 2023/2/17 21:09
 * @Version 1.0
 * 给定整数数组 nums 和整数 k，请返回数组中第 k 个最大的元素。
 *
 * 请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 *
 * 你必须设计并实现时间复杂度为 O(n) 的算法解决此问题。
 *
 */
public class no_215_数组中的第K个最大元素 {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
