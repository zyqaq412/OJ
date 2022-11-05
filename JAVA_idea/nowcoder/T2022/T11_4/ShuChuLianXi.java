package T11_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @title: ShuChuLianXi
 * @Author zxwyhzy
 * @Date: 2022/11/4 22:45
 * @Version 1.0
 */
public class ShuChuLianXi {
    /*
     * @Date: 2022/11/4 22:45
     * Math.pow 返回第一个参数的第二个参数次方
     */

        static Scanner in = new Scanner(System.in);
        static int t = 0;
        static Long l, k, r;
        static boolean flag = false;

        public static void main(String[] args) {
            t = in.nextInt();
            while (t-- > 0) {
                l = in.nextLong();
                r = in.nextLong();
                k = in.nextLong();
                long m = 1;
                flag = false;
                if (l==0 && k==0){
                    flag = true;
                    System.out.print(0+" ");
                }
                if (l < 2 && r>0){//
                    flag = true;
                    System.out.print(1 +" ");
                }
                if (k > 1){
                    int i = 1;
                    while (i < 64 && Math.pow(k, i) < Math.pow(2, 63)){
                        m =m * k;
                        if (m >= l && m<=r){
                            flag = true;
                            System.out.print(m+" ");
                        }
                        i++;
                    }
                }
                if (!flag) System.out.print("None.");
                System.out.println();
            }
        }
    }





/*
public class Main {
    static Scanner in = new Scanner(System.in);
    static int t = 0;
    static Long l, k, r;
    static boolean flag = false;

    public static void main(String[] args) {
        t = in.nextInt();
        while (t-- > 0) {
            l = in.nextLong();
            r = in.nextLong();
            k = in.nextLong();
            long m = 1;
            flag = false;
            if (l==0 && k==0){
                flag = true;
                System.out.print(0+" ");
            }
            if (l < 2 && r>0){//
                flag = true;
                System.out.print(1 +" ");
            }
            if (k > 1) {
                for (int i = 1; i < 64 && Math.pow(k, i) < Math.pow(2, 63); ++i) {
                    m = m * k;
                    if (l <= m && m <= r) {
                        flag = true;
                        System.out.print(m + " ");
                    }
                }
            }
            if (!flag) System.out.print("None.");
            System.out.println();
        }
    }
}*/


