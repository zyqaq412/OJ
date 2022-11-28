package 数组相关.数组遍历;

import java.util.ArrayList;
import java.util.List;

/**
 * @title: no_54_螺旋矩阵
 * @Author zxwyhzy
 * @Date: 2022/11/28 20:17
 * @Version 1.0
 */
public class no_54_螺旋矩阵 {


    /*
        12345
        34566
        21987
    */

    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int c = 0;//层数

        int count = (Math.min(n,m)+1)/2;
        List<Integer> list = new ArrayList<>();
        while (c < count){
            //从左向右
            for (int i = c; i < n-c; i++) {
                list.add(matrix[c][i]);
            }
            //从上往下
            for (int i = c+1; i < m-c; i++) {
                list.add(matrix[i][n-1-c]);
            }
            //从右往左，如果这一层只有1行，那么第一个循环已经将该行打印了，这里就不需要打印了，即 （m-1-i ）!= i
            //
            for (int i = n-1-(c + 1 ); (i >= c) && (m-1-c) != c ; i--) {
                list.add(matrix[m-1-c][i]);
            }
            //从下往上，如果这一层只有1列，那么第2个循环已经将该列打印了，这里不需要打印，即(n-1-c) != c
            for (int i = m-1 - (c+1); (i >= c+1) && (n-1-c) != c ; i--) {
                list.add(matrix[i][c]);
            }
            c++;
        }
        return list;
    }
}
