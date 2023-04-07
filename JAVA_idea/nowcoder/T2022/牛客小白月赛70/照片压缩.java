package 牛客小白月赛70;

import java.util.Scanner;

/**
 * @title: 照片压缩
 * @Author zxwyhzy
 * @Date: 2023/4/7 19:35
 * @Version 1.0
 */
public class 照片压缩 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[][] arr =new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        yaSuo(arr);

    }
    public static void yaSuo(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
        int[][] ans = new int[n/2][m/2];
        for (int i = 0; i < ans.length; i++) {

            for (int j = 0; j < ans[0].length; j++) {
                ans[i][j] = (arr[i*2][j*2]
                        + arr[i*2][j*2+1]
                        + arr[i*2+1][j*2]
                        + arr[i*2+1][j*2+1])/4;
            }
        }
        for(int[] as:ans){
            for (int a:as){
                System.out.print(a);
            }
            System.out.println();
        }
    }
}
