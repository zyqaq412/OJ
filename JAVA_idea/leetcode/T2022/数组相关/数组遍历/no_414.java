package 数组相关.数组遍历;

/**
 * @title: no_414
 * @Author zxwyhzy
 * @Date: 2022/10/26 22:44
 * @Version 1.0
 *
 * 给你一个非空数组，返回此数组中 第三大的数 。如果不存在，则返回数组中最大的数。
 *
 * 输入：[3, 2, 1]
 * 输出：1
 * 解释：第三大的数是 1 。
 *
 * 输入：[2, 2, 3, 1]
 * 输出：1
 * 解释：注意，要求返回第三大的数，是指在所有不同数字中排第三大的数。
 * 此例中存在两个值为 2 的数，它们都排第二。在所有不同数字中排第三大的数为 1
 *
 */
public class no_414 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,3,3,4,5,45,5,45,4};
        System.out.println(new no_414().thirdMax(nums));
    }

    public int thirdMax(int[] nums) {

        long a = Long.MIN_VALUE;
        long b = Long.MIN_VALUE;
        long c = Long.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > a){
                c = b;
                b =a;
                a = nums[i];
            }else if (a > nums[i] && nums[i] > b ){// a > nums[i] 去重
                c = b;
                b = nums[i];
            }else if (b > nums[i] && nums[i] > c){
                c = nums[i];
            }
        }
        return (int) (c==Long.MIN_VALUE ? a : c);

    }
}
