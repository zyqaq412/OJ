package 数组相关.二维数组变换;

/**
 * @title: no_566_重塑矩阵
 * @Author zxwyhzy
 * @Date: 2022/12/1 20:20
 * @Version 1.0
 */
public class no_566_重塑矩阵 {

    public int[][] matrixReshape(int[][] mat, int r, int c) {

        if (r*c != mat.length*mat[0].length) return mat;

        int[][] arr = new int[r][c];
        int a=0,b=0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                arr[a][b] = mat[i][j];
                if (b<c-1)b++;
                else {
                    b = 0;
                    a++;
                }
            }
        }
        return arr;
    }
}
