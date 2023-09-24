package 哈希表;

import java.util.*;

/**
 * @title: no_438_找到字符串中所有字母异位词
 * @Author zxwyhzy
 * @Date: 2023/9/24 12:52
 * @Version 1.0
 * 给定两个字符串 s 和 p，找到 s 中所有 p 的 异位词 的子串，返回这些子串的起始索引。不考虑答案输出的顺序。
 * <p>
 * 异位词 指由相同字母重排列形成的字符串（包括相同的字符串）。
 */
public class no_438_找到字符串中所有字母异位词 {

    public List<Integer> findAnagrams(String s, String p) {
        int sLen = s.length(), pLen = p.length();

        if (sLen < pLen) {
            return new ArrayList<Integer>();
        }

        List<Integer> ans = new ArrayList<Integer>();
        int[] sCount = new int[26];
        int[] pCount = new int[26];
        for (int i = 0; i < pLen; ++i) {
            ++sCount[s.charAt(i) - 'a'];
            ++pCount[p.charAt(i) - 'a'];
        }

        if (Arrays.equals(sCount, pCount)) {
            ans.add(0);
        }

        for (int i = 0; i < sLen - pLen; ++i) {
            --sCount[s.charAt(i) - 'a'];
            ++sCount[s.charAt(i + pLen) - 'a'];

            if (Arrays.equals(sCount, pCount)) {
                ans.add(i + 1);
            }
        }

        return ans;
    }
/*    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        Map<String,Integer> hm = new HashMap<>();
        hm.put(stringSort(p),0);
        for (char c : p.toCharArray() ){
            hm.put(String.valueOf(c),0);
        }
        int sl = s.length();
        int pl = p.length();
        for (int i = 0 ; i < sl - pl +1 ;i++){
            if (hm.containsKey(String.valueOf(s.charAt(i)))){
                if (hm.containsKey(stringSort(s.substring(i,i+pl)))){
                    ans.add(i);
                }
            }
        }
        return ans;
    }

    public String stringSort(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }*/

/*    // 过了很慢
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int np = p.length();
        int length = s.length();
        String pp = stringSort(p);
        for (int i = 0; i < length - np + 1; i++) {
            String temp = s.substring(i, i + np);
            if (pp.equals(stringSort(temp))) ans.add(i);
        }
        return ans;
    }

    public String stringSort(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }*/
}
