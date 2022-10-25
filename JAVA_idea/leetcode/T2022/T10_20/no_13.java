package hzy.T2022.T10_20;

/**
 * @title: no_13
 * @Author zxwyhzy
 * @Date: 2022/10/20 19:05
 * @Version 1.0
 * 第十三题：罗马数字转整数
 */
public class no_13 {
    public int romanToInt(String s) {
        char[] lm = s.toCharArray();
        int sum = 0;
        int r = getNum(lm[0]);
        for(int i=1;i<lm.length;i++){
            if(r<getNum(lm[i])){
                sum -= r;
                r = getNum(lm[i]);
            }else{
                sum += r;
                r=getNum(lm[i]);
            }
        }
        sum += r;
        return sum;
    }
    private int getNum(char c){
        switch(c){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;

        }
    }
}
