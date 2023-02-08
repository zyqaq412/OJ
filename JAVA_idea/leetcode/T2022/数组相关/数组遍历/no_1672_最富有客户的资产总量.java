package 数组相关.数组遍历;

import java.util.Arrays;

/**
 * @title: no_1672_最富有客户的资产总量
 * @Author zxwyhzy
 * @Date: 2023/2/8 23:18
 * @Version 1.0
 * 给你一个 m x n 的整数网格 accounts ，其中 accounts[i][j] 是第 i​​​​​​​​​​​​ 位客户在第 j 家银行托管的资产数量。返回最富有客户所拥有的 资产总量 。
 *
 * 客户的 资产总量 就是他们在各家银行托管的资产数量之和。最富有客户就是 资产总量 最大的客户。
 *
 *
 */
public class no_1672_最富有客户的资产总量 {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
           max = Math.max(sumAccount(accounts[i]),max);
        }
        return max;
    }
    public int sumAccount (int[] account){
        int sum =0;
        for (int i = 0; i < account.length; i++) {
            sum += account[i];
        }
        return sum;
    }
}
