package 数组相关.二维数组及滚动数组;

import java.util.ArrayList;
import java.util.List;

/**
 * @title: no118_杨辉三角
 * @Author zxwyhzy
 * @Date: 2022/11/23 16:02
 * @Version 1.0
 *
 *
 * 给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。
 *
 * 在「杨辉三角」中，每个数是它左上方和右上方的数的和。
 */
public class no118_杨辉三角 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0;i<numRows;i++){
            List<Integer> list = new ArrayList<>();
            for (int j=0;j<=i;j++){
                //杨辉三角前两层都是1， 每一层第一个和最后一个都是1
                if (j == 0 || j==i){
                    list.add(1);
                }else {
                    //从第3层开始(第一个和最后一个除外) 每层第j个数是前一层
                    list.add(lists.get(i-1).get(j-1) + lists.get(i-1).get(j));
                }
            }
            lists.add(list);
        }
        return lists;
    }
}
