/**
 * @title: no_461_汉明距离
 * @Author zxwyhzy
 * @Date: 2023/5/21 18:32
 * @Version 1.0
 * 两个整数之间的 汉明距离 指的是这两个数字对应二进制位不同的位置的数目。
 *
 * 给你两个整数 x 和 y，计算并返回它们之间的汉明距离。
 */
public class no_461_汉明距离 {
    class Solution {
        public int hammingDistance(int x, int y) {
            // 相同为0不同为1
            x ^= y;
            int count = 0;
            // 统计为位数1的个数
            while(x>0){
                if(( x & 1) ==1)
                    count++;
                x >>=1;
            }
            return count ;
        }
    }
}
