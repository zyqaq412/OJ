package 栈和队列;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @title: no_239_滑动窗口最大值
 * @Author zxwyhzy
 * @Date: 2023/9/20 22:47
 * @Version 1.0
 * 给你一个整数数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。
 * 你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位。
 *
 * 返回 滑动窗口中的最大值 。
 */
public class no_239_滑动窗口最大值 {
    // 自定义队列 保存有可能成为窗口里最大值的元素
    class MyQueue {
        Deque<Integer> queue;
        public MyQueue() {
            queue = new LinkedList<>();
        }
        public void add(int i) {

            while (!queue.isEmpty() && queue.getLast() < i) {
                queue.pollLast();
            }
            queue.add(i);
        }
        public int poll() {
            return queue.poll();
        }
        public int peek() {
            return queue.peek();
        }
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        MyQueue queue = new MyQueue();
        int[] ans = new int[nums.length - k + 1];
        for (int i = 0; i < k; i++) {
            queue.add(nums[i]);
        }
        int count = 0;
        ans[count++] = queue.peek();
        for (int i = k; i < nums.length; i++) {
            if (nums[i - k] == queue.peek()) queue.poll();
            queue.add(nums[i]);
            ans[count++] = queue.peek();
        }

        return ans;
    }


    // 超时
/*    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            max = max > nums[i] ? max : nums[i];
        }
        ans.add(max);
        int j = 0;
        for (int i = k; i < nums.length; i++) {
            if (nums[i] > max && nums[j] != max){
                j++;
                max = nums[i];
            }else {
                j++;
                max = getMax(nums,j,i);
            }

            ans.add(max);
        }
        int[] a = new int[ans.size()];
        int c = 0;
        for(int i : ans){
            a[c++] = i;
        }


        return a;
    }
    public int getMax(int[] nums,int i,int j){
        int max = Integer.MIN_VALUE;
        for (int i1 = i; i1 <= j; i1++) {
            max = max > nums[i1] ? max : nums[i1];
        }
        return max;
    }*/
}
