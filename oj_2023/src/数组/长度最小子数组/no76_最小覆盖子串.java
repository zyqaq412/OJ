package 数组.长度最小子数组;

import java.util.HashMap;
import java.util.Map;

/**
 * @title: no76_最小覆盖子串
 * @Author zxwyhzy
 * @Date: 2023/9/12 15:39
 * @Version 1.0
 *
 *
 * 给你一个字符串 s 、一个字符串 t 。返回 s 中涵盖 t 所有字符的最小子串。如果 s 中不存在涵盖 t 所有字符的子串，则返回空字符串 "" 。
 * 注意：
 * 对于 t 中重复字符，我们寻找的子字符串中该字符数量必须不少于 t 中该字符数量。
 * 如果 s 中存在这样的子串，我们保证它是唯一的答案。
 * https://leetcode.cn/problems/minimum-window-substring/description/
 */
public class no76_最小覆盖子串 {
    // 字符串t的字母与个数
    HashMap<Character, Integer> tm = new HashMap<>();
    // 滑动窗口的字母与个数
    HashMap<Character, Integer> hm = new HashMap<>();

    public String minWindow(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        if (sLen < tLen) return "";

        for (int i = 0; i < tLen; i++) {
            tm.put(t.charAt(i), tm.getOrDefault(t.charAt(i), 0) + 1);
        }

        String ans = "";
        int len = Integer.MAX_VALUE;
        int left = 0;
        for (int right = 0; right < sLen; right++) {
            hm.put(s.charAt(right), hm.getOrDefault(s.charAt(right), 0) + 1);
            while (check()) {
                if (len > (right - left)) {
                    len = right - left + 1;
                    ans = s.substring(left, right + 1);
                }
                hm.put(s.charAt(left), hm.get(s.charAt(left)) - 1);
                left++;
            }

        }
        return ans;
    }

    // 判断滑动窗口是否爆发字符串t
    private boolean check() {
        // 使用foreach遍历
        for (Map.Entry<Character, Integer> entry : tm.entrySet()) {
            if (hm.getOrDefault(entry.getKey(), 0) < entry.getValue()) {
                return false;
            }
        }
        return true;
    }
}
