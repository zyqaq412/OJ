import java.util.Stack;

/**
 * @title: no_20_有效的括号
 * @Author zxwyhzy
 * @Date: 2023/4/22 19:19
 * @Version 1.0
 *
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 每个右括号都有一个对应的相同类型的左括号。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class no_20_有效的括号 {

    static class Solution {

        public static void main(String[] args) {
            String s = "]";
            System.out.println(new Solution().isValid(s));
        }

        public boolean isValid(String s) {
            // 栈先进后出
            Stack<Character> stack = new Stack();
            char[] charArray = s.toCharArray();
            int len = charArray.length;
            for (int i = 0; i < len; i++) {
                if (charArray[i] == '(' || charArray[i] == '[' || charArray[i] == '{') {
                    // 如果是左括号就入栈
                    stack.add(charArray[i]);
                    // 不是就判断是哪一个右括号
                } else if (charArray[i] == ')') {
                    // 如果栈不为空 并且栈最上层能和右阔号配对
                    if (!stack.isEmpty() && stack.peek() == '(')
                        stack.pop();
                    // 不能配对 左括号就不是以正确的顺序闭合。
                    else
                        return false;
                } else if (!stack.isEmpty() &&charArray[i] == ']') {
                    if (stack.peek() == '[')
                        stack.pop();
                    else
                        return false;
                } else if (!stack.isEmpty() &&charArray[i] == '}') {
                    if (stack.peek() == '{')
                        stack.pop();
                    else
                        return false;
                }else {
                    // 既不是左括号又没有能配对的左括号
                    // 说明当前右括号是栈第一个元素
                    // 直接返回false
                    return false;
                }
            }

            // 最后栈为空就返回true
            if (stack.isEmpty())
                return true;
            else return false;
        }
    }
}
