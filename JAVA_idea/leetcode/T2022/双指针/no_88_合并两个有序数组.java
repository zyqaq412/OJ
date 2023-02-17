package 双指针;

import java.util.Arrays;

/**
 * @title: no_88_合并两个有序数组
 * @Author zxwyhzy
 * @Date: 2023/2/17 21:49
 * @Version 1.0
 * 给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
 *
 * 请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
 *
 * 注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。为了应对这种情况，nums1 的初始长度为 m + n，其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。
 */
public class no_88_合并两个有序数组 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[j];
            j++;
        }
        Arrays.sort(nums1);
    }
    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int n1,n2,n3;
        n1 = m-1;
        n2=n-1;
        n3=nums1.length-1;
        while (n3 >= 0 ){
            if (n1 == -1) {
                while (n3 >= 0 ) nums1[n3--] = nums2[n2--];
                return;
            }
            else if (n2 == -1) {
                while (n3 >= 0 ) nums1[n3--] = nums1[n1--];
                return;
            }
            if (nums1[n1] > nums2[n2]) nums1[n3--] = nums1[n1--];
            else nums1[n3--] = nums2[n2--];
        }
    }
    public void merge3(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1, p2 = n - 1;
        int tail = m + n - 1;
        int cur;
        while (p1 >= 0 || p2 >= 0) {
            if (p1 == -1) {
                cur = nums2[p2--];
            } else if (p2 == -1) {
                cur = nums1[p1--];
            } else if (nums1[p1] > nums2[p2]) {
                cur = nums1[p1--];
            } else {
                cur = nums2[p2--];
            }
            nums1[tail--] = cur;
        }
    }
}
