/**
 * @title: no_121_买卖股票的最佳时机
 * @Author zxwyhzy
 * @Date: 2023/5/21 18:41
 * @Version 1.0
 * 给定一个数组 prices ，它的第i 个元素prices[i] 表示一支给定股票第 i 天的价格。
 * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
 * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
 */
public class no_121_买卖股票的最佳时机 {
    class Solution {
        public int maxProfit(int[] prices) {
            // 最便宜的买入价格
            int min = Integer.MAX_VALUE;
            // 最大收益
            int max = 0;
            for (int i = 0; i < prices.length; i++) {
                if (prices[i]<min){
                    min=prices[i];
                    continue;
                }
                if (max<(prices[i]-min)){
                    max = prices[i]-min;
                }
            }
            return max;
        }
    }
}
