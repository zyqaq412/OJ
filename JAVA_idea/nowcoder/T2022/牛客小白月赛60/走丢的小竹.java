package 牛客小白月赛60;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @title: 走丢的小竹
 * @Author zxwyhzy
 * @Date: 2022/11/11 19:13
 * @Version 1.0
 */
public class 走丢的小竹 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int n,m,q;
        n = sc.nextInt();
        m = sc.nextInt();
        q = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (hashMap.containsKey(a)){
                int temp = hashMap.get(a);
                temp++;
                hashMap.put(a,temp);
            }else {
                hashMap.put(a,1);
            }
        }
        for (int i = 0; i < q; i++) {

            int x = hashMap.get(sc.nextInt());
            System.out.println(n-x);
        }
    }
}
