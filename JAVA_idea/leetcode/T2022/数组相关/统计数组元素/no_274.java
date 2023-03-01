package 数组相关.统计数组元素;

import java.util.Arrays;

/**
 * @title: no_274
 * @Author zxwyhzy
 * @Date: 2022/10/28 23:17
 * @Version 1.0
 *
 * 给你一个整数数组 citations ，其中 citations[i] 表示研究者的第 i 篇论文被引用的次数。计算并返回该研究者的 h 指数。
 *
 * 根据维基百科上 h 指数的定义：h 代表“高引用次数”，一名科研人员的 h指数是指他（她）的 （n 篇论文中）总共有 h 篇论文分别被引用了至少 h 次。且其余的 n - h 篇论文每篇被引用次数 不超过 h 次。
 *
 * 如果 h 有多种可能的值，h 指数 是其中最大的那个。
 *
 */
public class no_274 {
    public static void main(String[] args) {
        int[] a = {3,0,6,1,5};
        System.out.println(new no_274().hIndex(a));
    }

   // 二刷
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int length = citations.length;
        int h = 0;
        for (int i = length-1; i >= 0; i--) {
            if (citations[i] > h) h++;
        }
        return h;
    }





    public int hIndex1(int[] citations) {
        //排序
        Arrays.sort(citations);
        int h = 0;
        for (int i = citations.length-1; i>=0 ;i--){
            if (citations[i] >h ) h++;
        }
        return h;
    }
    public int hIndex2(int[] citations) {
        int length = citations.length;
        // 当前引用次数(index)的论文有几篇(count[index])
        int[] count = new int[length + 1];
        for (int citation : citations) {
            if (citation >= length){
                // 对于引用次数大于n的论文，加到下标为n处
                count[length]++;
            } else {
                count[citation]++;
            }
        }
        // 引用次数出现的和
        int sum = 0;
        // i从大到小，保证了返回值是h指数中最大的那个
        for (int i = length; i >= 0; i--) {
            sum += count[i];
            if (sum >= i){
                // 如果h为i，需要保证i处sum >= h，即sum >= i
                return i;
            }
        }
        return 0;
    }
}
