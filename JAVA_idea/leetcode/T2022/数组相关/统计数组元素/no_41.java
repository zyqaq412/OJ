package 数组相关.统计数组元素;

/**
 * @title: no_41
 * @Author zxwyhzy
 * @Date: 2022/10/28 22:34
 * @Version 1.0
 *
 * 给你一个未排序的整数数组 nums ，请你找出其中没有出现的最小的正整数。
 *
 * 请你实现时间复杂度为 O(n) 并且只使用常数级别额外空间的解决方案。
 */
public class no_41 {
    public static void main(String[] args) {
        int[] a = {1,2,0};
        System.out.println(new no_41().firstMissingPositive(a));
    }
    /*
     * @Date: 2022/10/28 23:02
     * 最小未出现正整数应该是 1到n+1 中的一个数
     * o(3n)-->o(n)
     */
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            //先给数组中小于0的数设置为大与n的数 因为后面要将出现过的数字置为负数
            if (nums[i] <= 0) nums[i] = n+1;
        }
        for (int i = 0; i < n; i++) {
            //Math.abs(nums[i]) >n  说明是负数或者大于n的数 不会是最小未出现正整数
            //在 1-n 范围内的数字才判断
            if (Math.abs(nums[i])<=n && nums[Math.abs(nums[i])-1] > 0)
                nums[Math.abs(nums[i])-1] = -nums[Math.abs(nums[i])-1];
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0)
                return i+1;//没进这个if判断，就说明1到n都出现了
        }
        //就返回 n+1
        return n+1;
    }
}
