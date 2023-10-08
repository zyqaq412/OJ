package 字符串;

/**
 * @title: no_541_反转字符串II
 * @Author zxwyhzy
 * @Date: 2023/10/8 22:45
 * @Version 1.0
 */
public class no_541_反转字符串II {
    public String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();
        for(int i = 0; i < ch.length; i += 2 * k){
            int l = i;
            //这里是判断尾数够不够k个来取决右指针指针的位置
            int r= Math.min(ch.length - 1, l + k - 1);
            //用异或运算反转
            while(l < r){
                ch[l] += ch[r];
                ch[r] = (char) (ch[l] - ch[r]);
                ch[l] -= ch[r];
                l++;
                r--;
            }
        }
        return new String(ch);
    }
}
