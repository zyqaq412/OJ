public class no_4_寻找两个正序数组的中位数 {
    /* 
     * 给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。

算法的时间复杂度应该为 O(log (m+n)) 。

来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/median-of-two-sorted-arrays
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            // 记录两个数组长度
            int l1 = nums1.length; int l2 =nums2.length;
            // 合并两个数组
            double[] arr= new double[l1+l2];
            // 遍历数组指针
            int l = 0; int r = 0;
            // true 数组长度是偶数  false 数组长度是奇数
            boolean falg = ((l1+l2)&1) ==0 ? true:false;
            for(int i=0;i<l1+l2;i++){
                if(l<l1&&r<l2){
                    if(nums1[l] < nums2[r]){
                        arr[i] = nums1[l];
                        l++;
                    }else{
                        arr[i] = nums2[r];
                        r++;
                    }
                }else{
                    if(l<l1){
                        arr[i] = nums1[l];
                        l++;
                    }else{
                        arr[i] = nums2[r];
                        r++;
                    }
                }
                // 求中位数合并的数组有一半就行了
                if(i == (l1+l2)/2){
                    if(falg){
                        return (arr[i]+arr[i-1])/2;
                    }else{
                        return arr[i];
                    }
                }

            }
            return 0;

        }
    }
}
