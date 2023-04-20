import java.util.*;

public class no_15_三数之和{
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        List<List<Integer>> threeSum = new Solution().threeSum(arr);
        for(List<Integer> ls:threeSum){
            for(Integer l : ls){
                System.out.print(l+"\t");
            }
            System.out.println();
        }
    }
 static class Solution {
     public List<List<Integer>> threeSum(int[] nums) {// 51ms
         // 当前数组的长度为空，或者长度小于3时，直接退出
         if(nums.length<3) return new ArrayList();
         // 排序
         Arrays.sort(nums);
         // 排序后第一个数大于0 直接返回空集
         if(nums[0] > 0) return new ArrayList();

         int len = nums.length;

         List<List<Integer>> lists = new ArrayList<>();
         for(int i = 0;i<len;i++){
             // 跳过重复i
             if (i>0 && nums[i]==nums[i-1]) continue;
             // left从i+1开始也是避免重复解
             int left = i+1;
             int right = len-1;

             while(left<right){
                 var list = new  ArrayList<Integer>();
                 int sum = nums[i]+nums[left]+nums[right];
                 if(sum == 0){
                     list.add(nums[i]);
                     list.add(nums[left]);
                     list.add(nums[right]);
                     lists.add(list);
                     while(left<right&&nums[left]==nums[left+1]){
                         left++;
                     }
                     while(left<right&&nums[right]==nums[right-1]){
                         right--;
                     }
                     left++;
                     right--;
                 }else if(sum < 0){
                     left++;
                 }else{
                     right--;
                 }
             }
         }
         return lists;
     }
     // 优化
     public List<List<Integer>> threeSum2(int[] nums) {// 33ms
         List<List<Integer>> result = new ArrayList<>();
         // 当前数组的长度为空，或者长度小于3时，直接退出
         if (nums.length < 3) {
             return result;
         }
         // 排序
         Arrays.sort(nums);
         // 排序后第一个数大于0 直接返回空集
         if (nums[0] > 0) {
             return result;
         }
         int len = nums.length;
         for (int i = 0; i < len; i++) {
             // 跳过重复的i值，以避免重复
             if (i > 0 && nums[i] == nums[i - 1]) {
                 continue;
             }
             int left = i + 1;
             int right = len - 1;
             while (left < right) {
                 int sum = nums[i] + nums[left] + nums[right];
                 if (sum == 0) {
                     // 找到一个解，添加到结果中
                     result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                     int leftVal = nums[left];
                     int rightVal = nums[right];
                     // 跳过重复的左指针和右指针值，以避免重复
                     while (left < right && nums[left] == leftVal) {
                         left++;
                     }
                     while (left < right && nums[right] == rightVal) {
                         right--;
                     }
                 } else if (sum < 0) {
                     left++;
                 } else {
                     right--;
                 }
             }
         }
         return result;
     }




    }



}
