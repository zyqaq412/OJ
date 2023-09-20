package 栈和队列;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @title: no_225_用队列实现栈
 * @Author zxwyhzy
 * @Date: 2023/9/20 21:30
 * @Version 1.0
 */
public class no_225_用队列实现栈 {
    class MyStack {
        Queue<Integer> queue;
        int size;

        public MyStack() {
            queue = new ArrayDeque<>();
            size = 0;
        }

        public void push(int x) {
            queue.add(x);
            size++;
        }

        public int pop() {
            while (size != 1){
                Integer poll = queue.poll();
                queue.add(poll);
                size--;
            }
            int ans = queue.poll();
            size = queue.size();
            return ans;
        }

        public int top() {
            while (size != 1){
                Integer poll = queue.poll();
                queue.add(poll);
                size--;
            }
            int ans = queue.poll();
            queue.add(ans);
            size = queue.size();
            return ans;
        }

        public boolean empty() {
            return queue.isEmpty();
        }
    }
}
