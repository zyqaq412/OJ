package 周赛.z_339;

import java.util.*;

/**
 * @title: no_2610_转换二维数组
 * @Author zxwyhzy
 * @Date: 2023/4/3 21:20
 * @Version 1.0
 *
 *
 * 给你一个整数数组 nums 。请你创建一个满足以下条件的二维数组：
 *
 * 二维数组应该 只 包含数组 nums 中的元素。
 * 二维数组中的每一行都包含 不同 的整数。
 * 二维数组的行数应尽可能 少 。
 * 返回结果数组。如果存在多种答案，则返回其中任何一种。

 * 请注意，二维数组的每一行上可以存在不同数量的元素。
 */
public class no_2610_转换二维数组 {

    public static void main(String[] args) {
        int[] a = {1,3,4,1,2,3,1};
        List<List<Integer>> matrix = new no_2610_转换二维数组().findMatrix(a);
        for (List<Integer> list: matrix){
            for (Integer n : list){
                System.out.print(n+"\t");
            }
            System.out.println();
        }


    }
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        HashMap<Integer,Integer> cnt = new HashMap<>();
        for(int n: nums){
            if (cnt.containsKey(n)) cnt.put(n,cnt.get(n)+1);
            else cnt.put(n,1);
        }
        while (!cnt.isEmpty()){
            List<Integer> row = new ArrayList<>();

            for(Iterator<Map.Entry<Integer, Integer>> it = cnt.entrySet().iterator();it.hasNext();){
                Map.Entry<Integer, Integer> next = it.next();
                row.add(next.getKey());
                next.setValue(next.getValue()-1);
                if (next.getValue()==0) it.remove();
            }
            ans.add(row);
        }
        return ans;
    }
}
