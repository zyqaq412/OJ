import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @title: no_169_多数元素
 * @Author zxwyhzy
 * @Date: 2023/5/8 13:54
 * @Version 1.0
 */
public class no_169_多数元素 {
   static class Solution {
        public static void main(String[] args) {
            int[] arr = {1,2};
            new Solution().majorityElement(arr);
        }
        public int majorityElement(int[] nums) {
            int len = nums.length;
            Map<Integer,Integer> map = new HashMap<>();
            for (int i = 0; i < len; i++) {
                if (!map.containsKey(nums[i])){
                    map.put(nums[i],1);
                }else {
                    map.put(nums[i],map.get(nums[i])+1);
                    if (map.get(nums[i]) > len/2) return nums[i];
                }
            }
            return nums[0];
        }
        // 优化
       public int majorityElement2(int[] nums) {
           Arrays.sort(nums);
           int len = nums.length;
           int max = 0;
           int count = 1;
           for (int i = 1; i < len; i++) {
               if (nums[i] == nums[i-1]){
                   count++;
                   max = Math.max(max,count);
                   if (max>len/2) return nums[i];
               }
           }
           return nums[0];
       }
       public int majorityElement3(int[] nums) {
           Arrays.sort(nums);
           return nums[nums.length / 2];
       }



       // 分治算法

       private int countInRange(int[] nums, int num, int lo, int hi) {
           int count = 0;
           for (int i = lo; i <= hi; i++) {
               if (nums[i] == num) {
                   count++;
               }
           }
           return count;
       }

       private int majorityElementRec(int[] nums, int lo, int hi) {
           // 数组中只有一个数那它就是众数
           if (lo == hi) {
               return nums[lo];
           }

           // 开始分治
           int mid = (hi - lo) / 2 + lo;
           int left = majorityElementRec(nums, lo, mid);
           int right = majorityElementRec(nums, mid + 1, hi);

           // 两边众数一样就返回
           if (left == right) {
               return left;
           }

           // 不一样 在lo-hi 范围内(合并两边) 统计出现个数返回大的一个
           int leftCount = countInRange(nums, left, lo, hi);
           int rightCount = countInRange(nums, right, lo, hi);

           return leftCount > rightCount ? left : right;
       }

       public int majorityElement4(int[] nums) {
           return majorityElementRec(nums, 0, nums.length - 1);
       }

    }
}
