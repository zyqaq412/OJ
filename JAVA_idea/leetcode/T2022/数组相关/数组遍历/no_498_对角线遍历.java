package 数组相关.数组遍历;

/**
 * @title: no_498_对角线遍历
 * @Author zxwyhzy
 * @Date: 2022/12/1 19:24
 * @Version 1.0
 */
public class no_498_对角线遍历 {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int[] order = new no_498_对角线遍历().findDiagonalOrder(mat);
        for (int i : order) {
            System.out.print(i+"");
        }
    }


    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;//有多少一维数组
        int n = mat[0].length;//每个数组的元素个数
        int[] arr = new int[m * n];

        //遍历次数
        int c = (m + n) - 1;
        int index = 0;
        int a = 0, b = 0;
        for (int i = 0; i < c; i++) {

            //右上
            if (i % 2 == 0) {
                while (a >= 0 && b < n) {
                    arr[index++]=mat[a][b];
                    if (!((a-1)>=0&&(b+1)<n)) break;
                    a--;
                    b++;
                }
                if (b<n-1)b++;//右上->左下 刚开始是向右移一格
                else if (a<m-1) a++;//之后向下移
                else break;

            //左下
            } else {
                while (a<m&&b>=0){
                    arr[index++]=mat[a][b];
                    if (!((a+1)<m&&(b-1)>=0)) break;
                    a++;
                    b--;
                }
                if (a<m-1) a++;
                else if (b<n-1)b++;
                else break;
            }

        }
        return arr;

    }


}
