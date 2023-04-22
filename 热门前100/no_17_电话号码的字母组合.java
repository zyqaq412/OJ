import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @title: no_17_电话号码的字母组合
 * @Author zxwyhzy
 * @Date: 2023/4/20 22:55
 * @Version 1.0
 */
public class no_17_电话号码的字母组合 {



    class Solution {
        public List<String> letterCombinations(String digits) {
            HashMap<Integer,String> hm = new HashMap<>();
            hm.put(2,"abc");
            hm.put(3,"def");
            hm.put(4,"ghi");
            hm.put(5,"jkl");
            hm.put(6,"mno");
            hm.put(7,"pqrs");
            hm.put(8,"tuv");
            hm.put(9,"wxyz");
            List<String> res = new ArrayList<>();
            int len = digits.length();
            for (int i = 0; i < len; i++) {

            }


            return null;

        }
    }
}
