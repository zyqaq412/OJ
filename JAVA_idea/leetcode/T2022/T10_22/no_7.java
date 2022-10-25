package hzy.T2022.T10_22;

/**
 * @title: no_7
 * @Author zxwyhzy
 * @Date: 2022/10/22 21:15
 * @Version 1.0
 */
public class no_7 {
    public static void main(String[] args) {
        int x = 1534236469;
        System.out.println(new no_7().reverse(x));
    }
    /*
     * @Date: 2022/10/22 21:56
     * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。

        如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。

        假设环境不允许存储 64 位整数（有符号或无符号）。


     */
    public int reverse1(int x){
            int res = 0;
            while(x!=0) {
                //每次取末尾数字
                int tmp = x%10;
                //判断是否 大于 最大32位整数
                if (res>214748364 || (res==214748364 && tmp>7)) {
                    return 0;
                }
                //判断是否 小于 最小32位整数
                if (res<-214748364 || (res==-214748364 && tmp<-8)) {
                    return 0;
                }
                res = res*10 + tmp;
                x /= 10;
            }
            return res;
        }
    public int reverse(int x) {
        if (x > Math.pow(2,31)-1 || x < -Math.pow(2,31)){
            return 0;
        }
        boolean flag = true;
        if (x < 0){
            x = -x;
            flag = !flag;
        }

        char[] x1 = String.valueOf(x).toCharArray();
        int i = 0;
        int j = x1.length-1;
        char temp = ' ';
        while ( i < j){
            temp = x1[i];
            x1[i] = x1[j];
            x1[j] = temp;
            i++;
            j--;
        }
        String xxx = "";
        for (char c : x1) {
            xxx += c;
        }
        int num = 0;
        try {
             num = Integer.parseInt(xxx);
        }catch (Exception e){
            return 0;
        }

        if (flag){
            return num;
        }else {
            return -num;
        }





        /*int a = x ;
        int b = 0;
        int i = x1.length();
        while (a >0){
            b += a%10 * (int) ( Math.pow(10,i-1));
            a /= 10;
        }
        return b;*/
    }
}
