import java.util.HashSet;

public class no_3_无重复最长字串 {

    class Solution {
        public int lengthOfLongestSubstring(String s) {
            // 存储的元素是没有重复的，而且是无序的
            HashSet hs = new HashSet<>();
            char[] chars = s.toCharArray();
            int l = chars.length;
            int maxLen = 0;
            int len = 0;
            int start = 0;
            for (int i = 0; i < l;) {
            /* if (start == l)
                return maxLen; */
                // 将指定的元素添加到此集合（如果尚未存在）。
                if (hs.add(chars[i])) {
                    i++;
                    len++;
                    maxLen = maxLen > len ? maxLen : len;
                } else {
                    // set存在改原素 就从头开始删直到改元素添加成功
                    len--;
                    hs.remove(chars[start]);
                    start++;
                }
            }
            return maxLen;
        }
    }
}

