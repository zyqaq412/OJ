package 栈和队列;

/**
 * @title: no_1047_删除字符串中的所有相邻重复项
 * @Author zxwyhzy
 * @Date: 2023/9/20 22:04
 * @Version 1.0
 */
public class no_1047_删除字符串中的所有相邻重复项 {
    public String removeDuplicates(String s) {
        StringBuffer stack = new StringBuffer();
        char[] strs = s.toCharArray();
        for (int i = 0; i < strs.length; i++) {
            if (!stack.isEmpty()){
                if (stack.charAt(stack.length()-1) == strs[i]){
                    stack.deleteCharAt(stack.length()-1);
                }else {
                    stack.append(strs[i]);
                }
            }else {
                stack.append(strs[i]);
            }
        }
        return stack.toString();
    }
}
