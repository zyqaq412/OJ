package 栈和队列;

import java.util.Stack;

/**
 * @title: no_150_逆波兰表达式求值
 * @Author zxwyhzy
 * @Date: 2023/9/20 22:18
 * @Version 1.0
 */
public class no_150_逆波兰表达式求值 {
    public static void main(String[] args) {
        String[] tokens = {"4","13","5","/","+"};
        new no_150_逆波兰表达式求值().evalRPN(tokens);
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            if (isNumber(tokens[i])){
                stack.add(Integer.valueOf(tokens[i]));
            }else {
                stack.add(count(stack.pop(),stack.pop(),tokens[i]));
            }
        }
        return stack.pop();

    }
    public boolean isNumber(String c){
        if (c.equals("+") ||c.equals("-") ||c.equals("*") ||c.equals("/"))return false;
        return true;

    }
    public int count(int b,int a,String s){
        if (s.equals("+")) return a+b;
        if (s.equals("-")) return a-b;
        if (s.equals("*")) return a*b;
        if (s.equals("/")) return a/b;
        return 0;
    }
}
