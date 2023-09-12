package 数组.移除元素;

/**
 * @title: no283_移动零
 * @Author zxwyhzy
 * @Date: 2023/9/12 16:03
 * @Version 1.0
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 * https://leetcode.cn/problems/move-zeroes/description/
 */
public class no283_移动零 {
    public void moveZeroes(int[] nums) {
        int slowIndex = 0;
        for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex] != 0) {
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }
        }
        while(slowIndex < nums.length){
            nums[slowIndex++] = 0;

        }
    }
}
