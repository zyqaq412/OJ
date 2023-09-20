package 栈和队列;

import java.util.Stack;

/**
 * @title: no_20_有效的括号
 * @Author zxwyhzy
 * @Date: 2023/9/20 21:44
 * @Version 1.0
 */
public class no_20_有效的括号 {
    public static void main(String[] args) {
        new no_20_有效的括号().isValid("()");
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] strs = s.toCharArray();

        for (int i = 0; i < strs.length; i++) {
            if (isRight(strs[i])) {
                if (stack.size() == 0 ) return false;
                if (!isTure(stack.pop(), strs[i])) return false;
            } else {
                stack.add(strs[i]);
            }
        }
        if (stack.size()>0) return false;
        return true;

    }

    public boolean isRight(char c) {
        if (c == ')' || c == '}' || c == ']') return true;
        else return false;
    }

    public boolean isTure(char l, char r) {
        if (l == '(' && r == ')') {
            return true;
        } else if (l == '[' && r == ']') {
            return true;
        } else if (l == '{' && r == '}') {
            return true;
        }
        return false;
    }

}
