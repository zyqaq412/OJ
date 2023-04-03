package 周赛.z_339;

/**
 * @title: no_2609_最长字字符串
 * @Author zxwyhzy
 * @Date: 2023/4/3 20:59
 * @Version 1.0
 *
给你一个仅由 0 和 1 组成的二进制字符串 s 。
如果子字符串中 所有的 0 都在 1 之前 且其中 0 的数量等于 1 的数量，则认为 s 的这个子字符串是平衡子字符串。请注意，空子字符串也视作平衡子字符串。
返回 s 中最长的平衡子字符串长度。
子字符串是字符串中的一个连续字符序列。

 */
public class no_2609_最长字字符串 {
    public int findTheLongestBalancedSubstring(String s) {
        char[] chars = s.toCharArray();
        //current 当前的  previous 之前的
        int count=0,pre=0,cur=0;
        for (int i = 0;i<s.length();i++){
            cur++;
            if (i==s.length()-1 || chars[i] != chars[i+1]){
                if (chars[i]=='1') count = Math.max(count,2*Math.min(pre,cur));
                pre = cur;
                cur = 0;
            }

        }
        return count;
    }
}
