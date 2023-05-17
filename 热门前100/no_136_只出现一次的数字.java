/**
 * @title: no_136_只出现一次的数字
 * @Author zxwyhzy
 * @Date: 2023/5/17 22:34
 * @Version 1.0
 * 给你一个 非空 整数数组 nums ，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *你必须设计并实现线性时间复杂度的算法来解决此问题，且该算法只使用常量额外空间。
 */
public class no_136_只出现一次的数字 {
    class Solution {
        public int singleNumber(int[] nums) {
            int ans = 0;
            for(int n : nums){
                // 异或 相同为0不同为1  101 xor 0 = 101 101 xor 101 = 000
                // 任何数 xor 0 = 任何数  相同数xor = 0
                // 最后只会留下单独(单数个)出现的数
                ans ^= n;
            }
            return ans;
        }
    }
}
