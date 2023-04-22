import java.util.ArrayList;
import java.util.List;

/**
 * @title: 剑指offer62_圆圈中最后剩下的数字
 * @Author zxwyhzy
 * @Date: 2023/4/22 20:38
 * @Version 1.0
 * <p>
 * 0,1,···,n-1这n个数字排成一个圆圈，从数字0开始，每次从这个圆圈里删除第m个数字（删除后从下一个数字开始计数）。求出这个圆圈里剩下的最后一个数字。
 * <p>
 * 例如，0、1、2、3、4这5个数字组成一个圆圈，从数字0开始每次删除第3个数字，则删除的前4个数字依次是2、0、4、1，因此最后剩下的数字是3。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/yuan-quan-zhong-zui-hou-sheng-xia-de-shu-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class 剑指offer62_圆圈中最后剩下的数字 {
    static class Solution {
        public static void main(String[] args) {

            System.out.println(new Solution().lastRemaining(5, 3));
        }

        public int lastRemaining(int n, int m) {
            List<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(i);
            }
            return rmNum(arr, 0, m);
        }

        public static int rmNum(List<Integer> arr, int index, int m) {
            int l = arr.size();
            if (l == 1) return arr.get(0);
            index = (index + m - 1) % l;
            arr.remove(index);
            return rmNum(arr, index, m);
        }

        public int lastRemaining2(int n, int m) {
            int ans = 0; // 最终活下来那个人的初始位置
            for (int i = 2; i <= n; i++) {
                ans = (ans + m) % i;  // 每次循环右移
            }
            return ans;
        }

        public int lastRemaining3(int n, int m) {
            return f(n, m);
        }

        public int f(int n, int m) {
            if (n == 1) return 0;
            return (f(n - 1, m) + m) % n;
        }
    }
}
