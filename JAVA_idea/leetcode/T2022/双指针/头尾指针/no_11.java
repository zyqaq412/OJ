package 双指针.头尾指针;

/**
 * @title: no_11
 * @Author zxwyhzy
 * @Date: 2022/10/20 19:04
 * @Version 1.0
 * 第十一题：盛最多水的容器
 * 给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。
 *
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *
 * 返回容器可以储存的最大水量。
 *
 * 说明：你不能倾斜容器。

 */
public class no_11 {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1;
        int area=Math.min(height[l],height[r])*(r-l);

        while (l<r){
            if (height[l] < height[r]){
                l++;
                area = Math.max(area,Math.min(height[l],height[r])*(r-l));
            }else {
                r--;
                area = Math.max(area,Math.min(height[l],height[r])*(r-l));
            }
        }
        return area;
    }







/*    public int maxArea(int[] h) {
        int max = 0;
        int i = 0;
        int j = h.length-1;
        while(! (i == j)){
            max = h[i] > h [j]?
                    Math.max(max,(j-i)*h[j--]):
                    Math.max(max,(j-i)*h[i++]);
        }
        return max;
    }*/
}
