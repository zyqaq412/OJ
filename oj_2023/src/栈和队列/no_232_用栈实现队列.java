package 栈和队列;

import java.util.Stack;

/**
 * @title: no_232_用栈实现队列
 * @Author zxwyhzy
 * @Date: 2023/9/20 21:19
 * @Version 1.0
 */
public class no_232_用栈实现队列 {
    class MyQueue {
        Stack<Integer> in;
        Stack<Integer> out;

        public MyQueue() {
            in = new Stack();
            out = new Stack();
        }

        public void push(int x) {
            in.push(x);
        }

        public int pop() {
            while (!in.isEmpty()){
                int temp = in.pop();
                out.push(temp);
            }
            int ans = out.pop();
            while (!out.isEmpty()){
                int temp = out.pop();
                in.push(temp);
            }
            return ans;
        }

        public int peek() {
            while (!in.isEmpty()){
                int temp = in.pop();
                out.push(temp);
            }
            int ans = out.peek();
            while (!out.isEmpty()){
                int temp = out.pop();
                in.push(temp);
            }
            return ans;
        }

        public boolean empty() {
            return in.isEmpty();
        }
    }
}
