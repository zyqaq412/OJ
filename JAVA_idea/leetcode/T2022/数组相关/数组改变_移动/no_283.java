package 数组相关.数组改变_移动;

/**
 * @title: no_283
 * @Author zxwyhzy
 * @Date: 2022/10/31 23:12
 * @Version 1.0
 *
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 *
 *
 */
public class no_283 {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,0,3,0,1,2,3,5,0,12};
        new  no_283().moveZeroes3(a);
    }
    public void moveZeroes3(int[] nums) {
        if(nums==null) {
            return;
        }
        //两个指针i和j
        int j = 0;
        for(int i=0;i<nums.length;i++) {
            //当前元素!=0，就把其交换到左边，等于0的交换到右边
            if(nums[i]!=0) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j++] = tmp;
            }
        }
    }

    public void moveZeroes2(int[] nums) {
        if(nums==null) {
            return;
        }
        //第一次遍历的时候，j指针记录非0的个数，只要是非0的统统都赋给nums[j]
        int j = 0;
        for(int i=0;i<nums.length;++i) {
            if(nums[i]!=0) {
                nums[j++] = nums[i];
            }
        }
        //非0元素统计完了，剩下的都是0了
        //所以第二次遍历把末尾的元素都赋为0即可
        for(int i=j;i<nums.length;++i) {
            nums[i] = 0;
        }

    }
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        while (j< nums.length && i<nums.length){
            if (nums[i]==0){
                j= i+1;
                while (j<nums.length){
                    if (nums[j] !=0){
                        nums[i] = nums[j];
                        nums[j] = 0;
                        break;
                    }
                    j++;
                }
                i++;
            }else {
                i++;
            }
        }


    }
}
