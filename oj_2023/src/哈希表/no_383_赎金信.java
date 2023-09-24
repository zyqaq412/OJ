package 哈希表;

import java.util.HashMap;
import java.util.Map;

/**
 * @title: no_383_赎金信
 * @Author zxwyhzy
 * @Date: 2023/9/24 12:25
 * @Version 1.0
 * 给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。
 * 如果可以，返回 true ；否则返回 false 。
 * magazine 中的每个字符只能在 ransomNote 中使用一次。
 */
public class no_383_赎金信 {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> hm = new HashMap<>();
        int r = 0, m = 0;
        while (r < ransomNote.length() || m < magazine.length()) {
            if (r < ransomNote.length()) {
                char c = ransomNote.charAt(r);
                hm.put(c, hm.getOrDefault(c, 0) + 1);
                r++;
            }
            if (m < magazine.length()) {
                char c = magazine.charAt(m);
                hm.put(c, hm.getOrDefault(c, 0) - 1);
                m++;
            }
        }
        for (int i : hm.values()) {
            if (i > 0) return false;
        }
        return true;
    }
}
