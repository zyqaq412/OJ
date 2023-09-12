/**
 * @title: 剑指offer29_顺时针打印矩阵
 * @Author zxwyhzy
 * @Date: 2023/9/12 15:15
 * @Version 1.0
 */
public class 剑指offer29_顺时针打印矩阵 {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0){
            return new int[0];
        }
        int m = matrix.length;
        int n = matrix[0].length;
        // 结果集
        int[] ans = new int[m*n];
        // 左，右，上，下边界
        int l = 0,r = n-1,t = 0,b = m-1;
        int count  = 0;

        while (true){
            // 左到右
            for (int i = l; i <= r; i++) {
                ans[count++] = matrix[t][i];
            }
            if (++t > b) break;
            // 上到下
            for (int i = t; i <= b; i++) {
                ans[count++] = matrix[i][r];
            }
            if (--r < l) break;
            // 右到左
            for (int i = r; i >= l; i--) {
                ans[count++] = matrix[b][i];
            }
            if (--b < t) break;
            // 下到上
            for (int i = b; i >= t; i--) {
                ans[count++] = matrix[i][l];
            }
            if (++l > r) break;
        }
        return ans;
    }
}
