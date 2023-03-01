package 数组相关.数组改变_移动;

import com.sun.xml.internal.ws.api.pipe.Tube;

/**
 * @title: no_665
 * @Author zxwyhzy
 * @Date: 2022/10/31 22:42
 * @Version 1.0
 *
 * 给你一个长度为n的整数数组nums，请你判断在 最多 改变1 个元素的情况下，该数组能否变成一个非递减数列。
 *
 * 我们是这样定义一个非递减数列的：对于数组中任意的i (0 <= i <= n-2)，总满足 nums[i] <= nums[i + 1]。

 */
public class no_665 {
    //[3,4,2,3]
    //因为只能改应该数字所以 最多有 一个i不满足nums[i] <= nums[i + 1] 的时候有可能改为非递减数列


    // 二刷
    public boolean checkPossibility2(int[] nums) {
        int n = nums.length, cnt = 0;
        for (int i = 0; i < n - 1; ++i) {
            int x = nums[i], y = nums[i + 1];
            if (x > y) {
                cnt++;
                if (cnt > 1) {
                    return false;
                }
                if (i > 0 && y < nums[i - 1]) {
                    nums[i + 1] = x;
                }
            }
        }
        return true;
    }








    public boolean checkPossibility(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; ++i) {
            int x = nums[i], y = nums[i + 1];
            if (x > y) {

                nums[i] = y;
                if (isSorted(nums)) {
                    return true;
                }
                nums[i] = x; // 复原
                nums[i + 1] = x;
                return isSorted(nums);
            }
        }
        return true;
    }

    public boolean isSorted(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n-1; ++i) {
            if (nums[i] > nums[i+1]) {
                return false;
            }
        }
        return true;
    }
}
