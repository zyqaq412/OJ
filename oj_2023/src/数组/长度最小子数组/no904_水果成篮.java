package 数组.长度最小子数组;

import java.util.HashMap;

/**
 * @title: no904_水果成篮
 * @Author zxwyhzy
 * @Date: 2023/9/12 15:38
 * @Version 1.0
 * 你正在探访一家农场，农场从左到右种植了一排果树。这些树用一个整数数组 fruits 表示，其中 fruits[i] 是第 i 棵树上的水果 种类 。
 * 你想要尽可能多地收集水果。然而，农场的主人设定了一些严格的规矩，你必须按照要求采摘水果：
 * 你只有 两个 篮子，并且每个篮子只能装 单一类型 的水果。每个篮子能够装的水果总量没有限制。
 * 你可以选择任意一棵树开始采摘，你必须从 每棵 树（包括开始采摘的树）上 恰好摘一个水果 。
 * 采摘的水果应当符合篮子中的水果类型。每采摘一次，你将会向右移动到下一棵树，并继续采摘。
 * 一旦你走到某棵树前，但水果不符合篮子的水果类型，那么就必须停止采摘。
 * 给你一个整数数组 fruits ，返回你可以收集的水果的 最大 数目。
 *
 * https://leetcode.cn/problems/fruit-into-baskets/description/
 */
public class no904_水果成篮 {

    public int totalFruit(int[] fruits) {
        int left = 0;
        HashMap<Integer, Integer> hm = new HashMap();
        int ans = 0;
        for (int right = 0; right < fruits.length; right++) {
            hm.put(fruits[right], hm.getOrDefault(fruits[right], 0) + 1);
            while (hm.size() > 2) {
                hm.put(fruits[left], hm.get(fruits[left]) - 1);
                if (hm.get(fruits[left]) == 0) {
                    hm.remove(fruits[left]);
                }
                left++;

            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}
