package 数组.有序数组的平方;

/**
 * @title: no977_有序数组的平方
 * @Author zxwyhzy
 * @Date: 2023/9/12 15:50
 * @Version 1.0
 */
public class no977_有序数组的平方 {
    public int[] sortedSquares(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int[] ans = new int[r+1];
        for(int i = ans.length-1 ;i>=0;i--){
            int l1 = nums[l]*nums[l];
            int r1 = nums[r]*nums[r];
            if(l1>r1){
                ans[i] = l1;
                l++;
            }else{
                ans[i] = r1;
                r--;
            }
        }
        return ans;
    }
}
