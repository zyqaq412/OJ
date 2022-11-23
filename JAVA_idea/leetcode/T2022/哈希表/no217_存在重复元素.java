package 哈希表;

import java.util.HashSet;

/**
 * @title: no217_存在重复元素
 * @Author zxwyhzy
 * @Date: 2022/11/23 15:46
 * @Version 1.0
 */
public class no217_存在重复元素 {

    /**
     *
     * @param nums
     * @return
     */
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            if (!hashSet.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}
