package com.hzy;

/**
 * @title: no11
 * @Author zxwyhzy
 * @Date: 2024/2/6 21:58
 * @Version 1.0
 */
public class no11 {
    public int maxArea(int[] height) {
        int max = 0;
        int l = 0;
        int r = height.length - 1;
        while (l < r){
            int temp = (r - l) * Math.min(height[l],height[r]);
            max = max > temp ? max : temp;
            if (height[l] < height[r]){
                l++;
            }else {
                r--;
            }
        }
        return max;
    }
}
