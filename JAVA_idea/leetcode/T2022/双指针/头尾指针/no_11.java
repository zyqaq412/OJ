package 双指针.头尾指针;

/**
 * @title: no_11
 * @Author zxwyhzy
 * @Date: 2022/10/20 19:04
 * @Version 1.0
 * 第十一题：盛最多水的容器
 */
public class no_11 {
    public int maxArea(int[] h) {
        int max = 0;
        int i = 0;
        int j = h.length-1;
        while(! (i == j)){
            max = h[i] > h [j]?
                    Math.max(max,(j-i)*h[j--]):
                    Math.max(max,(j-i)*h[i++]);
        }
        return max;
    }

}
