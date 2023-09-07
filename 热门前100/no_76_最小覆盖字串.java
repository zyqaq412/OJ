import java.util.HashMap;
import java.util.Map;

/**
 * @title: no_76_最小覆盖字串
 * @Author zxwyhzy
 * @Date: 2023/9/7 22:53
 * @Version 1.0
 */
public class no_76_最小覆盖字串 {

    public static void main(String[] args) {
        System.out.println(new no_76_最小覆盖字串().minWindow("ADOBECODEBANC","ABC"));
    }

    // 字符串t的字母与个数
    HashMap<Character,Integer> tm = new HashMap<>();
    // 滑动窗口的字母与个数
    HashMap<Character,Integer> hm = new HashMap<>();
    public String minWindow(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        if (sLen < tLen) return "";


        for (int i = 0; i < tLen; i++) {
            tm.put(t.charAt(i),tm.getOrDefault(t.charAt(i),0)+1);
        }

        String ans = "";
        int len = Integer.MAX_VALUE;
        int left = 0;
        for(int right = 0 ;right<sLen;right++){
            hm.put(s.charAt(right),hm.getOrDefault(s.charAt(right),0)+1);
            while (check()){
                if (len > (right-left)){
                    len = right-left+1;
                    ans = s.substring(left,right+1);
                }
                hm.put(s.charAt(left),hm.get(s.charAt(left))-1);
                left++;
            }

        }
        return ans;
    }
    // 判断滑动窗口是否爆发字符串t
    private boolean check(){
        // 使用foreach遍历
        for (Map.Entry<Character,Integer> entry : tm.entrySet()){
            if (hm.getOrDefault(entry.getKey(),0) < entry.getValue()){
                return false;
            }
        }
        return true;
    }


    // 使用迭代器遍历
//    private boolean check() {
//        // 获取HashMap中的键集合
//        Set<Character> keySet = tm.keySet();
//        // 使用迭代器遍历HashMap
//        Iterator<Character> iterator = keySet.iterator();
//        while (iterator.hasNext()) {
//            char key = iterator.next();
//            int value = tm.get(key);
//            if (hm.getOrDefault(key, 0) < value) {
//                return false;
//            }
//        }
//        return true;
//    }

}
