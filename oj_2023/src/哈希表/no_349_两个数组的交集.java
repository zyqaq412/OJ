package 哈希表;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @title: no_349_两个数组的交集
 * @Author zxwyhzy
 * @Date: 2023/9/24 13:17
 * @Version 1.0
 * 给定两个数组 nums1 和 nums2 ，返回 它们的交集 。输出结果中的每个元素一定是 唯一 的。我们可以 不考虑输出结果的顺序 。
 */
public class no_349_两个数组的交集 {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums2.length == 0 || nums1.length == 0) return null;
        Map<Integer,Integer> hm= new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i : nums1){
            hm.put(i,0);
        }
        for (int i : nums2){
            if (hm.containsKey(i) && hm.get(i) == 0) {
                list.add(i);
                hm.put(i,1);
            }
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}
