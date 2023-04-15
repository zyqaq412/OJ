import java.util.Arrays;
import java.util.HashMap;

public class no_1_两数之和 {

}

class Solution {
    // 哈希表
    public int[] twoSum3(int[] nums, int target) {
        // key 放值  value 放下标
        HashMap<Integer,Integer> hm = new HashMap<>();
        int l = nums.length;
        for(int i = 0;i<l;i++){
            // 查找hm 里面有没有 +nums[i] = target 的key
            if(hm.containsKey(target-nums[i])){
                // 有的话 返回 该key的value(下标)  和i
                return new int[]{i,hm.get(target-nums[i])};
            }else{
                hm.put(nums[i],i);
            }
        }
        return null;
    }

    // 双指针
    public int[] twoSum2(int[] nums, int target) {
        // 初始化左右指针
        int l = 0, r = nums.length - 1;
        // 复制数组 后面查找小标
        int[] tmp = Arrays.copyOf(nums, r + 1);
        // 数组排序 双指针需要数组有序
        Arrays.sort(nums);
        int a = 0, b = 0;
        while (l < r) {
            if (nums[l] + nums[r] == target) {
                a = nums[l];
                b = nums[r];
                break;
            } else if (nums[l] + nums[r] < target)
                l++;
            else
                r--;

        }
        int[] ans = new int[2];
        l = 0;
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i] == a || tmp[i] == b) {
                ans[l] = i;
                l++;
                if (l == 2)
                    return ans;
            }
        }

        return null;
    }

    // 暴力枚举
    public int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }
}