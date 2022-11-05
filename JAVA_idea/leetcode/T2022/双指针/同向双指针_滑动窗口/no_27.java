package 双指针.同向双指针_滑动窗口;

/**
 * @title: no_27
 * @Author zxwyhzy
 * @Date: 2022/10/20 19:10
 * @Version 1.0
 * 第二十七题：移除元素
 */
public class no_27 {
    public int removeElement(int[] nums, int val) {
        int t = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                nums[t] = nums[i];
                t++;
            }
        }
        return t;
    }
}
