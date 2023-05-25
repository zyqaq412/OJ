/**
 * @title: no_338_比特位计数
 * @Author zxwyhzy
 * @Date: 2023/5/25 20:10
 * @Version 1.0
 */
public class no_338_比特位计数 {
    class Solution {
        public int[] countBits(int n) {
            int[] res = new int[n + 1];
            res[0] = 0;
            for (int i = 1; i <= n; i++) {
                if ((i & 1) == 1) {
                    // 奇数 奇数比前一个偶数多一个1 末尾的1
                    // 2->010  3->011 4->100 5->101
                    res[i] = res[i - 1] + 1;
                } else {
                    // 偶数 偶数末尾是0 偶数的1和去掉末尾0的数一样多(右移一位也就是除以2)
                    // 4->100 >>1 10
                    res[i] = res[i >> 1];
                }
            }
            return res;
        }
    }
}
