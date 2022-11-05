package 数组相关.统计数组元素;

import java.util.ArrayList;
import java.util.List;

/**
 * @title: no_442
 * @Author zxwyhzy
 * @Date: 2022/10/28 22:00
 * @Version 1.0
 *
 * 给你一个长度为 n 的整数数组 nums ，其中 nums 的所有整数都在范围 [1, n] 内，且每个整数出现 一次 或 两次 。请你找出所有出现 两次 的整数，并以数组形式返回。
 *
 * 你必须设计并实现一个时间复杂度为 O(n) 且仅使用常量额外空间的算法解决此问题。

 */
public class no_442 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(1);
        list.add(1);

    }
    public List<Integer> findDuplicates(int[] nums) {
        List list = new ArrayList();

        for (int i = 0; i < nums.length; i++) {
            /*
             * @Date: 2022/10/28 22:15
             * 数组的数都在1-n n：数组长度
             * 每遍历一个数就将该数-1 下标处的数取反
             * 最后遍历数组 大于0 的数 下标+1就是缺少的数
             */
            if (nums[Math.abs(nums[i])-1] >0) // 大于o说明 Math.abs(nums[i]) 是第一次出现
                nums[Math.abs(nums[i])-1] = -nums[Math.abs(nums[i])-1];
            else list.add(Math.abs(nums[i]));

        }
        return list;
    }
}
