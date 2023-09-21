package 栈和队列;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @title: no_347_前k个高频元素
 * @Author zxwyhzy
 * @Date: 2023/9/21 19:47
 * @Version 1.0
 */
public class no_347_前k个高频元素 {

    public static void main(String[] args) {
        new no_347_前k个高频元素().topKFrequent(new int[] {1,1,1,2,2,3},2);
    }

    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        PriorityQueue<int[]> queue = new PriorityQueue<>(((o1, o2) -> o2[1] - o1[1]));

        for (Map.Entry<Integer, Integer> temp : map.entrySet()) {
            int[] t = new int[2];
            t[0] = temp.getKey();
            t[1] = temp.getValue();
            queue.add(t);
        }
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = queue.poll()[0];
        }
        return ans;
    }
}
