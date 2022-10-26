package T10_26;

/**
 * @title: no_628
 * @Author zxwyhzy
 * @Date: 2022/10/26 23:10
 * @Version 1.0
 *
 * 给你一个整型数组 nums ，在数组中找出由三个数组成的最大乘积，并输出这个乘积。

 * 示例 1：
 *
 * 输入：nums = [1,2,3]
 * 输出：6
 * 示例 2：
 *
 * 输入：nums = [1,2,3,4]
 * 输出：24
 * 示例 3：
 *
 * 输入：nums = [-1,-2,-3]
 * 输出：-6
 * */
public class no_628 {
    public static void main(String[] args) {
       int[] nums = {1000, -1000, -1000};
        System.out.println(new no_628().maximumProduct(nums));

    }


    public int maximumProduct(int[] nums) {
        // 最小的和第二小的
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        // 最大的、第二大的和第三大的
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;

        for (int x : nums) {
            if (x < min1) {
                min2 = min1;
                min1 = x;
            } else if (x < min2) {
                min2 = x;
            }

            if (x > max1) {
                max3 = max2;
                max2 = max1;
                max1 = x;
            } else if (x > max2) {
                max3 = max2;
                max2 = x;
            } else if (x > max3) {
                max3 = x;
            }
        }

        return Math.max(min1 * min2 * max1, max1 * max2 * max3);
    }

//    public int maximumProduct(int[] nums) {
//        int f1,f2,f3,z1,z2,z3;
//        f1 = 0;
//        f2 = 0;
//        f3 = 0;
//        z1 = 0;
//        z2 = 0;
//        z3 = 0;
//
//
//        for (int num : nums) {
//            if (num > 0){
//                //大于o
//                if (num > z1){
//                    z3 = z2;
//                    z2 = z1;
//                    z1 = num;
//                }else if (num>z2){
//                    z3 = z2;
//                    z2 = num;
//                }else if (num>z3){
//                    z3 = num;
//                }
//            }else {
//                if (Math.abs(num) > Math.abs(f1)){
//                    f3 = f2;
//                    f2 = f1;
//                    f1 = num;
//                }else if (Math.abs(num) > Math.abs(f2)){
//                    f3 = f2;
//                    f2 = num;
//                }else if (Math.abs(num) > Math.abs(f3)){
//                    f3 = num;
//                }
//
//            }
//        }
//        if (z3 ==0 ){
//            return f1*f2*f3;
//        }
//
//        return Math.max(z1*z2*z3,z1*f1*f2);
//    }

}
