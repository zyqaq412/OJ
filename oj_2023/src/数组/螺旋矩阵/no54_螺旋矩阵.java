package 数组.螺旋矩阵;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @title: no54_螺旋矩阵
 * @Author zxwyhzy
 * @Date: 2023/9/12 14:22
 * @Version 1.0
 *
 * 给你一个 m 行 n 列的矩阵 matrix ，请按照 顺时针螺旋顺序 ，返回矩阵中的所有元素。
 * https://leetcode.cn/problems/spiral-matrix/description/
 *
 */
public class no54_螺旋矩阵 {
    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            if (matrix.length == 0)
                return new ArrayList<Integer>();
            // 左，右，上，下边界
            int l = 0, r = matrix[0].length - 1, t = 0, b = matrix.length - 1, x = 0;
            Integer[] res = new Integer[(r + 1) * (b + 1)];
            while (true) {
                for (int i = l; i <= r; i++) res[x++] = matrix[t][i];
                if (++t > b) break;
                for (int i = t; i <= b; i++) res[x++] = matrix[i][r];
                if (l > --r) break;
                for (int i = r; i >= l; i--) res[x++] = matrix[b][i];
                if (t > --b) break;
                for (int i = b; i >= t; i--) res[x++] = matrix[i][l];
                if (++l > r) break;
            }
            return Arrays.asList(res);
        }
    }


    /*public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int count = m * n;
        if (count == 1){
            ans.add(matrix[0][0]);
            return ans;
        }
        int start = 0;
        int i = 0, j = 0;
        while (count > 0) {
            // 向右遍历
            while (j < n - 1 - start && count > 0) {
                ans.add(matrix[i][j]);
                j++;
                count--;
            }
            // 向下遍历
            while (i < m - 1 - start && count > 0) {
                ans.add(matrix[i][j]);
                i++;
                count--;
            }
            // 向左遍历
            while (j > 0 + start && count > 0) {
                ans.add(matrix[i][j]);
                j--;
                count--;
            }
            // 向上遍历
            while (i > 0 + start && count > 0) {
                ans.add(matrix[i][j]);
                i--;
                count--;
            }
            start++;
            i = start;
            j = start;
        }
        return ans;

    }
*/




    // [[1]] 超时
    /*public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int count = m * n;
        int start = 0;
        int i = 0, j = 0;
        while (count > 0) {
            // 向右遍历
            for (; j < n - 1; j++) {
                ans.add(matrix[i][j]);
                count--;
            }
            // 向下遍历
            for (; i < m - 1;i++){
                ans.add(matrix[i][j]);
                count--;
            }
            // 向左遍历
            for (; j > 0 + start;j--){
                ans.add(matrix[i][j]);
                count--;
            }
            // 向上遍历
            for (; i > 0 + start;i--){
                ans.add(matrix[i][j]);
                count--;
            }
            start++;
            i = start;
            j = start;
        }
        return ans;

    }*/
}
