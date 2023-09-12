package 数组.螺旋矩阵;

/**
 * @title: no59_螺旋矩阵II
 * @Author zxwyhzy
 * @Date: 2023/9/12 14:43
 * @Version 1.0
 *
 * 给你一个正整数 n ，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的 n x n 正方形矩阵 matrix 。
 *  https://leetcode.cn/problems/spiral-matrix-ii/description/
 *
 */
public class no59_螺旋矩阵II {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int temp = 1;
        int N = n * n;
        int startL = 0, startR = 0;

        while (temp <= N) {
            int l = startL, r = startR;
            while (r < n - startR) {
                matrix[l][r] = temp;
                temp++;
                r++;
            }
            r--;
            l++;
            while (l < n - startL) {
                matrix[l][r] = temp;
                temp++;
                l++;
            }
            l--;
            r--;
            while (r >= 0+startR){
                matrix[l][r] = temp;
                temp++;
                r--;
            }
            r++;
            l--;
            while (l > 0+startL){
                matrix[l][r] = temp;
                temp++;
                l--;
            }

            startR++;
            startL++;
        }
        return matrix;
    }
}
