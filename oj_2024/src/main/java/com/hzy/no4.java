package com.hzy;

/**
 * @title: no4
 * @Author zxwyhzy
 * @Date: 2024/2/3 13:20
 * @Version 1.0
 */
public class no4 {
    // 给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。

/*    首先创建一个新的数组nums来保存合并后的结果。
    使用两个指针mi和ni分别指向nums1和nums2的起始位置。
    遍历nums1和nums2，比较当前指针位置上的元素大小，将较小的元素放入新数组nums中，并移动相应的指针。
    如果其中一个数组已经全部合并到新数组中，将另一个数组中剩余的元素直接添加到新数组中。
    最后，判断合并后数组的长度是否为奇数，如果是奇数，则返回中间位置的元素；如果是偶数，则返回中间两个元素的平均值。
    时间复杂度： O(m + n)*/
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] nums = mergeArrays(nums1, nums2);
        int len = nums.length;
        if ((len & 1) == 1) {
            return nums[len / 2];
        } else {
            return (nums[len / 2] + nums[len / 2 - 1]) / 2.0;
        }
    }

    private int[] mergeArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int mi = 0, ni = 0;
        int[] ans = new int[m + n];
        int ai = 0;
        while (mi < m && ni < n) {
            if (nums1[mi] <= nums2[ni]) {
                ans[ai] = nums1[mi];
                ai++;
                mi++;
            } else {
                ans[ai] = nums2[ni];
                ai++;
                ni++;
            }
        }
        if (mi == m) {
            while (ni < n) {
                ans[ai] = nums2[ni];
                ni++;
                ai++;
            }
        } else {
            while (mi < m) {
                ans[ai] = nums1[mi];
                mi++;
                ai++;
            }
        }
        return ans;
    }
}
