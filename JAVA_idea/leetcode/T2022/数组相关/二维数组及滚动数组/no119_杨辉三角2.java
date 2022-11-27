package 数组相关.二维数组及滚动数组;

import java.util.ArrayList;
import java.util.List;

/**
 * @title: no119_杨辉三角2
 * @Author zxwyhzy
 * @Date: 2022/11/27 19:05
 * @Version 1.0
 */
public class no119_杨辉三角2 {


    /*

    1-->[1]
    2-->[1, 1]
    3-->[1, 2, 1]
    4-->[1, 3, 3, 1]
    5-->[1, 4, 6, 4, 1]
    6-->[1, 5, 10, 10, 5, 1]
    7-->[1, 6, 15, 20, 15, 6, 1]
    8-->[1, 7, 21, 35, 35, 21, 7, 1]
    9-->[1, 8, 28, 56, 70, 56, 28, 8, 1]
   */

    public static void main(String[] args) {
        System.out.println(new no119_杨辉三角2().getRow(3));



        /*List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
       // list.add(1,3);//[1, 3, 2]
       // list.set(1,3);//[1, 3]
        System.out.println(list);*/
    }
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            //每次循环都在末尾加1
            list.add(1);
            if (i==0||i==1){
                //如果在第1行和第2行 直接加1后直接下一跳
                continue;
            }else {
                //第3行开始 第j个数等于 上一行 j + j-1
                //因为只有一个数组 所以从数组后面开始计算
                for (int j = i-1; j> 0; j--) {
                    list.set(j,list.get(j)+list.get(j-1));
                }
            }

        }
        return list;

    }
}
