package 哈希表;

import java.util.HashMap;
import java.util.Map;

/**
 * @title: no_242
 * @Author zxwyhzy
 * @Date: 2023/9/24 12:02
 * @Version 1.0
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 *
 * 注意：若 s 和 t 中每个字符出现的次数都相同，则称 s 和 t 互为字母异位词。
 */
public class no_242_有效的字母异位词 {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        try {
            Map<Character,Integer> hm = new HashMap<>();
            for (char c : s.toCharArray()){
                hm.put(c,hm.getOrDefault(c,0)+1);
            }
            for (char c : t.toCharArray()){
                hm.put(c,hm.get(c)-1);
                if (hm.get(c) == 0) hm.remove(c);
            }
            if (hm.size() == 0) return true;

            return false;
        }catch (Exception e){
            return false;
        }
    }
}
