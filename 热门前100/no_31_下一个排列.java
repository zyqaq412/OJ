import java.util.Arrays;

/**
 * @title: no_31_下一个排列
 * @Author zxwyhzy
 * @Date: 2023/5/25 20:58
 * @Version 1.0
 */
public class no_31_下一个排列 {
    // 123465 -> 123564 -> 123546
    // 654321
class Solution {

    /*
    * 这段代码实现了下一个排列算法。
    * 它将数字重新排列为字典顺序下的下一个更大的排列。
    * 如果这样的排列不可能，则必须将其重新排列为最低可能顺序（即按升序排序）。
    * 替换必须就地进行，并且仅使用常数额外内存。
    * */
        public void nextPermutation(int[] nums) {
            int j = -1, k = -1;
            int length = nums.length;

            // 从右往左找到第一对满足 nums[i] > nums[i - 1] 的连续两个数
            for (int i = length - 1; i > 0; i--) {
                if (nums[i] > nums[i - 1]) {
                    j = i - 1;
                    break;
                }
            }

            // 如果没有这样的一对数，说明整个数组是降序排列的。将其升序排列并返回
            if (j == -1) {
                Arrays.sort(nums);
                return;
            }

            // 找到最右边的大于 nums[j] 的元素
            for (int i = length - 1; i > 0; i--) {
                if (nums[i] > nums[j]) {
                    k = i;
                    break;
                }
            }

            // 交换索引 j 和 k 处的数
            nums[j] += nums[k];
            nums[k] = nums[j] - nums[k];
            nums[j] -= nums[k];

            // 将索引 j+1 开始的子数组升序排列
            Arrays.sort(nums,j+1,length);
            // sort(nums,j+1);
        }


        // 自定义 数组指定子序列排序
        public void sort(int[] nums, int index) {
            int length = nums.length;
            for (int i = index; i < length-1; i++) {
                int min = i;

                for (int j = i + 1; j < length; j++) {
                    if (nums[j] < nums[min]) {
                        min = j;
                    }
                }
                if (min != i){
                    int temp = nums[i];
                    nums[i] = nums[min];
                    nums[min] = temp;
                }
            }
        }
    }
}
