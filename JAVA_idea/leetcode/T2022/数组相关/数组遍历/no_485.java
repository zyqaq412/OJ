package 数组相关.数组遍历;

/**
 * @title: no_485
 * @Author zxwyhzy
 * @Date: 2022/10/26 21:58
 * @Version 1.0
 *
 * 给定一个二进制数组 nums ， 计算其中最大连续 1 的个数。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [1,1,0,1,1,1]
 * 输出：3
 * 解释：开头的两位和最后的三位都是连续 1 ，所以最大连续 1 的个数是 3.
 * 示例 2:
 *
 * 输入：nums = [1,0,1,1,0,1]
 * 输出：2
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/max-consecutive-ones
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class no_485 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,0,1,0,1,1,1,1,1};
        System.out.println(new no_485().findMaxConsecutiveOnes3(nums));
    }

    // 二刷
    public int findMaxConsecutiveOnes3(int[] nums) {
        int max = 0;
        int count = 0;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] == 1) count++;
            else {
                max = Math.max(max,count);
                count = 0;
            }
        }
        return Math.max(max,count);

    }
    public int findMaxConsecutiveOnes(int[] nums) {
            int max = 0;
            int temp = 0;
        for (int i = 0; i < nums.length; i++) {

                if (nums[i]==1){
                    temp++;
                }else {
                    if (max < temp){
                        max = temp;
                    }
                    temp = 0;
                }
            if (i == nums.length-1){
                if (max < temp){
                    max = temp;
                }
            }
        }
        return max;
    }
    public int findMaxConsecutiveOnes2(int[] nums) {
        int max = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i]==1){
                temp++;
            }else {
                max = Math.max(max,temp);


                temp = 0;
            }
            max = Math.max(max,temp);

        }
        return max;
    }
}
