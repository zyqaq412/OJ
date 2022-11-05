package 数组相关.统计数组元素;

import java.util.HashMap;
import java.util.Map;

/**
 * @title: no_697
 * @Author zxwyhzy
 * @Date: 2022/10/28 20:34
 * @Version 1.0
 *
 * 数组的度
 * 给定一个非空且只包含非负数的整数数组nums，数组的 度 的定义是指数组里任一元素出现频数的最大值。
 *
 * 你的任务是在 nums 中找到与nums拥有相同大小的度的最短连续子数组，返回其长度。
 *
 *
 */
public class no_697 {
    public static void main(String[] args) {
        System.out.println(new no_697().findShortestSubArray(new int[]{1,2,2,3,1,4,2}));
    }
    public int findShortestSubArray(int[] nums) {
        Map<Integer,int[]> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                map.get(nums[i])[0]++;
                map.get(nums[i])[2] = i;
            }else {
                map.put(nums[i],new int[]{1,i,i});
            }
        }
        int max= 0;
        int minLen = Integer.MAX_VALUE;
        for (Map.Entry<Integer,int[]> entry: map.entrySet()){
            int[] a = entry.getValue();
                if (max < a[0] || (max == a[0] &&((a[2]-a[1]+1) < minLen))){
                    max = a[0];
                    minLen = a[2]-a[1]+1;
                }

        }
        return minLen;
        /**
         * 使用foreach遍历map集合，发现Map集合的键值对元素直接是没有类型的，所以不可以直接foreach遍历集合
         * 可以通过条用Map的方法entrySet把Map集合S转换成Set集合形式
         *
         */
        /*//1.把Map集合转换成Set集合
        Set<Map.Entry<String,Integer>> entries=maps.entrySet();
        //2.for开始遍历
        for(Map.Entry<String,Integer> entry:entries){
            String key=entry.getKey();
            int value=entry.getValue();
            System.out.println(key+"=====>"+value);
        }*/

    }
}
