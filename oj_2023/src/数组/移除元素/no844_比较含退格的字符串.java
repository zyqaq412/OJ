package 数组.移除元素;

import java.util.Stack;

/**
 * @title: no844_比较含退格的字符串
 * @Author zxwyhzy
 * @Date: 2023/9/12 16:04
 * @Version 1.0
 *
 * 给定 s 和 t 两个字符串，当它们分别被输入到空白的文本编辑器后，如果两者相等，返回 true 。# 代表退格字符。
 *
 * 注意：如果对空文本输入退格字符，文本继续为空。
 *
 * https://leetcode.cn/problems/backspace-string-compare/description/
 */
public class no844_比较含退格的字符串 {
    public boolean backspaceCompare(String s, String t) {
        Stack s1 = new Stack();
        Stack t1 = new Stack();
        char[] s2 = s.toCharArray();
        char[] t2 = t.toCharArray();

        // 处理s
        for (int i = 0; i < s2.length; i++) {
            if (s2[i] == '#' && (!s1.isEmpty())){
                s1.pop();
            }else if (s2[i] != '#'){
                s1.push(s2[i]);
            }
        }
        // 处理t
        for (int i = 0; i < t2.length; i++) {
            if (t2[i] == '#' && (!t1.isEmpty())){
                t1.pop();
            }else if (t2[i] != '#'){
                t1.push(t2[i]);
            }
        }
        if (s1.size() != t1.size()){
            return false;
        }
        while (!s1.isEmpty()){
            char s3 = (char) s1.peek();
            char t3 = (char) t1.peek();
            if (s3!=t3){
                return false;
            }
            s1.pop();
            t1.pop();
        }

        return true;
    }
}
