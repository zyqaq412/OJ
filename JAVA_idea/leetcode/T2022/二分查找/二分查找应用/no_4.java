package 二分查找.二分查找应用;

/**
 * @title: no_4
 * @Author zxwyhzy
 * @Date: 2022/10/20 18:59
 * @Version 1.0
 * 第四题：寻找两个正序数组的中位数
 */
public class no_4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int s =0;
        int x=0;

        int left =0;
        int right = 0;


        int l1=nums1.length;
        int l2=nums2.length;
        int l = nums1.length+nums2.length;

        for(int i=0;i <(l/2+1);i++){
            left =right;
            if(s<l1 &&( x>=l2||nums1[s]<nums2[x])){
                right =nums1[s];
                s++;

            }else{
                right = nums2[x];
                x++;
            }
        }
        if(l%2==0){
            return (left+right)/2.0;
        }else{
            return right;
        }

    }
}
