package 哈希表;

import java.util.HashMap;

/**
 * @title: no_383_赎金信
 * @Author zxwyhzy
 * @Date: 2023/2/9 0:06
 * @Version 1.0
 *  给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。
 *
 * 如果可以，返回 true ；否则返回 false 。
 *
 * magazine 中的每个字符只能在 ransomNote 中使用一次。
 *
 */
public class no_383_赎金信 {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> strs = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
             char c = magazine.charAt(i);
            if (!strs.containsKey(c)){
                strs.put(c,1);
            }else {
                strs.put(c,strs.get(c)+1);
            }
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            if (strs.containsKey(c)){
                strs.put(c,strs.get(c)-1);
                if (strs.get(c) == 0) strs.remove(c);
            }else {
                return false;
            }
        }
        return true;
    }
}
