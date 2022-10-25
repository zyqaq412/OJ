package hzy.T2022.T10_22;

/**
 * @title: no_6
 * @Author zxwyhzy
 * @Date: 2022/10/22 20:46
 * @Version 1.0
 */
/*
 * @Date: 2022/10/22 20:46
 * 字型转换
 */
public class no_6 {

    public static void main(String[] args) {
        String s =  "PAYPALISHIRING";
        System.out.println(new no_6().convert(s,3));
    }
    public String convert(String s, int numRows) {
        if (s.length()<=2 || numRows==1) return s;
        String[] ss = new String[Math.min(s.length(),numRows)];//数组每一个下标放一行的字符串
        for (int i = 0; i < ss.length; i++) ss[i] = "";//赋初值，不然是null
        int i = 0;//行号
        boolean flag = false;//方向变量
        for (int j = 0; j < s.length(); j++) {
            ss[i] += s.charAt(j);
            if (i==0 || i==numRows-1){//如果在第一行和最后一行就改变方向
                flag = !flag;
            }
            i += flag? 1 : -1;
        }
        String str ="";
        for (String s1 : ss) {
            str += s1;
        }
        return str;
    }
}
