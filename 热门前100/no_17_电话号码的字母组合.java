import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @title: no_17_电话号码的字母组合
 * @Author zxwyhzy
 * @Date: 2023/4/20 22:55
 * @Version 1.0
 */
public class no_17_电话号码的字母组合 {


    //TODO 以后做

    class Solution {
        Map<Character, String> phoneMap = new HashMap<>() {{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};
        List<String> res = new ArrayList<String>();
        StringBuffer buffer = new StringBuffer();
        public List<String> letterCombinations(String digits) {
            // 长度为0直接返回空集
            if (digits.length() == 0)  return res;
            // 回溯法（深度优先搜索）
            backtrack( digits, 0);
            return res;
        }

        public void backtrack(String digits, int index) {
            // 已经到最后一个结点
            if (index == digits.length()) res.add(buffer.toString());
            else {
                // 获取当前按键
                char digit = digits.charAt(index);
                // 获取按键对应的字母映射
                String letters = phoneMap.get(digit);
                for (int i = 0; i < letters.length(); i++) {
                    buffer.append(letters.charAt(i));
                    backtrack( digits, index+1);
                    buffer.deleteCharAt(index);
                }
            }
        }
    }
}
