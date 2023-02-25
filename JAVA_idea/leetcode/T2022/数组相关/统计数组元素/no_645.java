package 数组相关.统计数组元素;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/**
 * @title: no_645
 * @Author zxwyhzy
 * @Date: 2022/10/27 21:06
 * @Version 1.0
 *
 *
 * 集合 s 包含从 1 到 n 的整数。不幸的是，因为数据错误，
 * 导致集合里面某一个数字复制了成了集合里面的另外一个数字的值，
 * 导致集合 丢失了一个数字 并且 有一个数字重复 。
 *
 * 给定一个数组 nums 代表了集合 S 发生错误后的结果。
 *
 * 请你找出重复出现的整数，再找到丢失的整数，将它们以数组的形式返回。
 */
public class no_645 {

    // 二刷
    public int[] findErrorNums2(int[] nums) {
        TreeSet<Integer> set = new TreeSet();
        int[] ErrorNums = new int[2];
        for (int num : nums) {
            if (!set.add(num)){
                // 重复的数
                ErrorNums[0] = num;
            }
        }
        for (int i = 1; i <= nums.length; i++) {
            if (set.add(i)) {
                ErrorNums[1] = i;
                break;
            }
        }
        return ErrorNums;
    }

    public int[] findErrorNums(int[] nums) {
        TreeSet<Integer> set = new TreeSet();
        int[] a = new int[2];
        for (int num : nums) {
            if (!set.add(num)){
                a[0] = num;
            }
        }
        int i = 1;
        boolean flag = true;
        for (int o : set) {
            if (o==i){
                i++;
            }else {
                flag = !flag;
                a[1] = i;
                return a;
            }
        }
        if (flag){
            a[1] = i;
        }
        return a;

    }
}
