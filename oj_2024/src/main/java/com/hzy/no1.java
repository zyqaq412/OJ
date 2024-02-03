package com.hzy;

import java.util.HashMap;

/**
 * @title: no1
 * @Author zxwyhzy
 * @Date: 2024/2/3 12:35
 * @Version 1.0
 */
public class no1 {
/*    给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。

    你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。

    你可以按任意顺序返回答案。*/

    /* 暴力破解
    使用两个for循环进行枚举
    数组中同一个元素在答案里不能重复出现，所以第二层for循环从i+1开始

    时间复杂度：O(N^2)

    */
class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
/*   哈希表
    使用哈希表在遍历中记录数据然后比较哈希表中有没有和当前数相加等于target的值
    哈希表 key 使用数组的值方便使用 containsKey() 查找符合结果的数
    value 使用值的下标 方便返回结果

    时间复杂度：O(N)*/

    class Solution2{
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> hm = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {

                if (hm.containsKey(target - nums[i])) {
                    return new int[]{i,hm.get(target-nums[i])};
                } else {
                    hm.put(nums[i], i);
                }
            }
            return null;
        }
    }
}
