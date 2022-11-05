package 双指针.同向双指针_滑动窗口;

import java.util.HashSet;

/**
 * @title: no_3
 * @Author zxwyhzy
 * @Date: 2022/10/20 18:58
 * @Version 1.0
 * 第三题：无重复字符最长子串
 */
public class no_3 {
    public int lengthOfLongestSubstring(String s) {
        HashSet set = new HashSet<>();
        int start = 0;
        int length = 0;
        int maxLength=0;
        for(int i=0;i<s.length();){
            if(set.add(s.charAt(i))){
                i++;
                length++;
                if(length>maxLength){
                    maxLength=length;
                }
            }else{
                set.remove(s.charAt(start));
                length--;
                start++;
            }
        }
        return maxLength;
    }
}
