package hzy.T2022.T10_20;

/**
 * @title: no_1
 * @Author zxwyhzy
 * @Date: 2022/10/20 18:51
 * @Version 1.0
 * 第一题：两数之和
 */
public class no_1 {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
