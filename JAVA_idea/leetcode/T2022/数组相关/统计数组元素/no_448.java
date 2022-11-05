package 数组相关.统计数组元素;

import java.util.ArrayList;
import java.util.List;

/**
 * @title: no_448
 * @Author zxwyhzy
 * @Date: 2022/10/28 21:37
 * @Version 1.0
 *
 * 给你一个含 n 个整数的数组 nums ，其中 nums[i] 在区间 [1, n] 内。请你找出所有在 [1, n] 范围内但没有出现在 nums 中的数字，并以数组的形式返回结果。
 *

 */
public class no_448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List list = new ArrayList();

        for (int i = 0; i < nums.length; i++) {
                /*
                 * @Date: 2022/10/28 21:51
                 * 数组的数都在1-n n：数组长度
                 * 每遍历一个数就将该数-1 下标处的数取反
                 * 最后遍历数组 大于0 的数 下标+1就是缺少的数
                 */
            if (nums[Math.abs(nums[i])-1] >0)
                nums[Math.abs(nums[i])-1] = -nums[Math.abs(nums[i])-1];


        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0){
                list.add(i+1);
            }
        }
        return list;
    }
}
