package 数组相关.矩阵;

import com.sun.corba.se.impl.protocol.InfoOnlyServantCacheLocalCRDImpl;

/**
 * @title: no_661_图片平滑器
 * @Author zxwyhzy
 * @Date: 2023/3/3 22:04
 * @Version 1.0
 *
 *
图像平滑器 是大小为 3 x 3 的过滤器，用于对图像的每个单元格平滑处理，平滑处理后单元格的值为该单元格的平均灰度。

每个单元格的  平均灰度 定义为：该单元格自身及其周围的 8 个单元格的平均值，结果需向下取整。（即，需要计算蓝色平滑器中 9 个单元格的平均值）。

如果一个单元格周围存在单元格缺失的情况，则计算平均灰度时不考虑缺失的单元格（即，需要计算红色平滑器中 4 个单元格的平均值）。
 */
public class no_661_图片平滑器 {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length, n = img[0].length;
        // m排 每排n个
        int[][] ret = new int[m][n];
        // 前两个循环找到每一次求平均数的中间数
        // 后两次循环找中间数周围一圈的数
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int num = 0, sum = 0;
                // x=i-1 当前数的上一排 -> i+1 当前数的下一排
                for (int x = i - 1; x <= i + 1; x++) {
                    // 当前数的前一行->后一行
                    for (int y = j - 1; y <= j + 1; y++) {
                        if (x >= 0 && x < m && y >= 0 && y < n) {
                            num++;
                            sum += img[x][y];
                        }
                    }
                }
                ret[i][j] = sum / num;
            }
        }
        return ret;
    }
}
