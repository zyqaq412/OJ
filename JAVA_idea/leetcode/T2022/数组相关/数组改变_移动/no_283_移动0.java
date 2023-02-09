package 数组相关.数组改变_移动;

/**
 * @title: 移动0
 * @Author zxwyhzy
 * @Date: 2023/2/9 14:47
 * @Version 1.0
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 请注意，必须在不复制数组的情况下原地对数组进行操作。
 * 示例 1:
 * 输入: nums = [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 */
public class no_283_移动0 {
    public void moveZeroes(int[] nums) {
        int j =0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                // j记录不为0的个数
                nums[j++] = nums[i];
            }
        }
        while (j<nums.length){
            nums[j++] = 0;
        }
    }
}
