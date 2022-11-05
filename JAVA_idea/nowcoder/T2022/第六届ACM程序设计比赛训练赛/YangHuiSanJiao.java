package 第六届ACM程序设计比赛训练赛;


import java.util.Scanner;

/**
 * @title: YangHuiSanJiao
 * @Author zxwyhzy
 * @Date: 2022/11/5 14:34
 * @Version 1.0
 *
 * 计算出杨辉三角的第n项。
 */
public class YangHuiSanJiao {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int[] t = panDuanHangLie(a);
        long[][] aa = yHSJ();
        System.out.println(aa[t[0]][t[1]]);

    }

    public static long[][] yHSJ(){
        //建立杨辉三角数组
        long [][] a=new long[71][71];
        for(int i=1;i<=70;i++){
            for(int j=1;j<=i;j++){
                if(j==1||j==i){
                    a[i][j]=a[i][j]=1;
                }else{
                    a[i][j]=a[i-1][j-1]+a[i-1][j];
                }
            }
        }
        return a;

    }

    public static int[] panDuanHangLie(int a){
        //根据传入的第几个数确定 在哪行哪列
        int[] f = new int[2];
        int n = 1;
        int sum = 0;
        int temp;
        while (true){
            temp = sum;//前一行的前n项和
            sum = (n*n+n)/2;//当前行的请n项和
            if (sum >= a){//说明 在这一行
                f[0] = n;
                f[1] = a - temp;
                return f;
            }
            n++;
        }
    }

}
