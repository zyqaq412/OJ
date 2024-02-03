package com.hzy;

import java.util.HashSet;

/**
 * @title: no3
 * @Author zxwyhzy
 * @Date: 2024/2/3 12:35
 * @Version 1.0
 */
public class no3 {
    // 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。


/*    使用两个指针 l 和 r 表示当前不含重复字符子串的左右边界，初始时都指向字符串的开头。
    使用 HashSet 存储当前子串中的字符，以便快速检查字符是否重复出现。
    不断移动右指针 r，并将对应字符加入 HashSet。如果发现重复字符，说明当前子串中有重复字符，需要移动左指针 l，并将对应字符从 HashSet 中移除，直到子串中再次不含重复字符为止。
    在每一次长度增加时更新最大子串长度 maxLen，即 maxLen = maxLen > (r-l) ? maxLen : (r - l);。
    时间复杂度：O(n) 在每一步操作中，l 和 r 指针都会向前移动，而 HashSet 的操作是常数时间的，因此整体复杂度为 O(n)。*/
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int len = s.length();
        int maxLen = -1;

        int l = 0;
        int r = 0;
        while (r < len) {
            char c = s.charAt(r);
            if (hs.contains(c)) {
                maxLen = maxLen > (r - l) ? maxLen : (r - l);
                hs.remove(s.charAt(l));
                l++;
            } else {
                hs.add(c);
                r++;
            }
        }
        maxLen = maxLen > (r - l) ? maxLen : (r - l);
        return maxLen;
    }

}
