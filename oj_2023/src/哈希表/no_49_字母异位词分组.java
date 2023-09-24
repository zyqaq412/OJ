package 哈希表;

import java.util.*;

/**
 * @title: no_49_字母异位词分组
 * @Author zxwyhzy
 * @Date: 2023/9/24 12:33
 * @Version 1.0
 */
public class no_49_字母异位词分组 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> hm = new HashMap<>();
        for (String s : strs){
            String key = stringSort(s);
            if (hm.containsKey(key)){
                hm.get(key).add(s);
            }else {
                List<String> list = new ArrayList<>();
                list.add(s);
                hm.put(key,list);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for (List<String> list : hm.values()){
            ans.add(list);
        }
        return ans;
    }
    public String stringSort(String str){
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
