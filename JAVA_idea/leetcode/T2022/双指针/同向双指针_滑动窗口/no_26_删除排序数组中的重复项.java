package 双指针.同向双指针_滑动窗口;

/**
 * @title: no_26
 * @Author zxwyhzy
 * @Date: 2022/10/20 19:09
 * @Version 1.0
 * 第二十六题：删除有序数组中的重复项
 */
public class no_26_删除排序数组中的重复项 {
    public int removeDuplicates1(int[] nums) {
     /*   int t = 0;
        for (int i = 0; i < nums.length; i ++ ) {
            if (i == 0 || nums[i] != nums[i - 1]) nums[t ++ ] = nums[i];
        }
        return t;*/
        int i = 0;
        int j = 1;
        while(!(j==nums.length)){
            if(nums[i]==nums[j]){
                j++;
            }else{
                nums[i+1] = nums[j];
                i++;
            }

        }
        return i+1;
    }
    public int removeDuplicates2(int[] nums) {
        int j=0,i;
        for(i=1;i<nums.length;i++){

            if(nums[j] != nums[i]) nums[++j] = nums[i];
        }
        return j;
    }
}
