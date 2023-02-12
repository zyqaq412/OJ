package 双指针.同向双指针_滑动窗口;

/**
 * @title: no_80_删除排序数组中的重复项2
 * @Author zxwyhzy
 * @Date: 2023/2/12 18:53
 * @Version 1.0
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使得出现次数超过两次的元素只出现两次 ，返回删除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 *
 */
public class no_80_删除排序数组中的重复项2 {
    public int removeDuplicates(int[] nums) {
        int l=1,r=2;
         if (nums.length<=2) return 2;
         while (r < nums.length){
             if (nums[r] != nums[l] || nums[r] != nums[l-1]){
                 nums[++l] = nums[r++];
                // r++;
                // l++;
             }else {
                 r++;
             }
         }

        return l+1;
    }
}
