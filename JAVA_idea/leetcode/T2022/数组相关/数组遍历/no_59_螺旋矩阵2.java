package 数组相关.数组遍历;

/**
 * @title: no_59_螺旋矩阵2
 * @Author zxwyhzy
 * @Date: 2022/11/30 21:54
 * @Version 1.0
 */
public class no_59_螺旋矩阵2 {

    public static void main(String[] args) {

        int[][] ints = new no_59_螺旋矩阵2().generateMatrix(6);
        for (int[] anInt : ints) {
            for (int i : anInt) {
                System.out.printf("%d\t",i);
            }
            System.out.println();
        }
    }

    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];

        int c = (n+1)/2;//层数
        int index = 1;


        for (int i = 0; i < c; i++) {
            //向右
            //向右遍历 层数不变 列数变(从小到大) j<n-i (j<=n-1-i,n-1是n列的下标) n是列数 i是层数(从第0层开始)
            for (int j = i;j<n-i;j++){
                arr[i][j] = index++;
            }
            //向下
            //向下遍历 列数不变 层数变(从小到大) j = i+1; +1 是因为向右遍历的时候已经遍历过了
            for (int j = i+1;j<n-i;j++){
                arr[j][n-1-i] = index++;
            }
            //向左
            //向左遍历 层数不变 列数变(从大到小) n-1
            for (int j = n-1-i-1;j>=i;j--){
                arr[n-1-i][j] = index++;
            }
            //向上
            //向上遍历 列数不变 层数变(从大到小)
            for (int j = n-1-i-1;j>=0 && j>i;j--){
                arr[j][i] = index++;
            }

        }

        return arr;
    }
}
