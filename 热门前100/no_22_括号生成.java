import java.util.ArrayList;
import java.util.List;

/**
 * @title: no_22_括号生成
 * @Author zxwyhzy
 * @Date: 2023/4/25 21:26
 * @Version 1.0
 */
public class no_22_括号生成 {
    class Solution {

        public List<String> generateParenthesis(int n) {
            List<String> res = new ArrayList<String>();
            backtrack(res,new StringBuffer(),n,n);
            return res;
        }

        /**
         *  回溯法（深度优先搜索） 回溯算法的基本思想是：从一条路往前走，能进则进，不能进则退回来，换一条路再试。
         * @param res 返回结果
         * @param buffer 单次组合临时变量
         * @param left 左括号剩余数量
         * @param right 右括号剩余数量
         */
        public void backtrack(List<String > res,StringBuffer buffer ,int left,int right){
            if (left==0&&right==0){
                res.add(buffer.toString());
                return;
            }
            // 左括号剩余数量大于右括号剩余数量 那一定不是有效的组合 直接返回
            if (left>right)
                return;
            /*
            *  函数流程
            * 第一次 先全部左括号添加到buffer再右括号 ->  ((()))
            * 然后 2 结束后又将 ) 删除 一直到最后一个添加的 ( 被删除 -> ((
            * 往下走添加 ) 再进入回溯函数 -> (()
            * 会先加 ( -> (()(
            * 然后只剩下右括号 ->(()())
            * */
            // 必须先添加(
            if (left>0){
                // 左括号不为0就添加左括号
                buffer.append('(');
                backtrack(res,buffer,left-1,right);// 1
                buffer.deleteCharAt(buffer.length()-1);
            }
            //
            if (right>0){
                buffer.append(')');
                backtrack(res,buffer,left,right-1);// 2
                buffer.deleteCharAt(buffer.length()-1);
            }
        }
    }
}
