package 数与位.数字的位操作;

/**
 * @title: no_1342_操作次数
 * @Author zxwyhzy
 * @Date: 2023/2/8 22:54
 * @Version 1.0
 * 给你一个非负整数 num ，请你返回将它变成 0 所需要的步数。 如果当前数字是偶数，你需要把它除以 2 ；否则，减去 1 。
 * 输入：num = 14
 * 输出：6
 * 解释：
 * 步骤 1) 14 是偶数，除以 2 得到 7 。
 * 步骤 2） 7 是奇数，减 1 得到 6 。
 * 步骤 3） 6 是偶数，除以 2 得到 3 。
 * 步骤 4） 3 是奇数，减 1 得到 2 。
 * 步骤 5） 2 是偶数，除以 2 得到 1 。
 * 步骤 6） 1 是奇数，减 1 得到 0 。
 */
public class no_1342_操作次数 {
    public int numberOfSteps(int num) {
        int count = 0;
        while (num != 0 ){
            if (num%2 ==0 ){
                count++;
               num = num>>1;
            }else {
                count++;
                num--;
            }
        }
        return count;
    }
}
