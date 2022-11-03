package T11_3;

import java.util.Scanner;

/**
 * @title: WoHuiKaiBai
 * @Author zxwyhzy
 * @Date: 2022/11/3 23:23
 * @Version 1.0
 *
 * 链接：https://ac.nowcoder.com/acm/contest/43844/A
 * 来源：牛客网
 *
 * 由于开摆，我开始在纸上乱画。我画出了一个 4\times 44×4 的矩形，矩形中的每个位置上可能被我涂黑（用 “#” 表示）或没有被涂黑（用 “.” 表示）。
 * 如果其中存在一个 2\times 22×2 的矩形满足其中的每个位置都被我涂黑或者都没被我涂黑，那我就会感到开心。
 */
public class WoHuiKaiBai {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        //nextLine()会把nextInt()，next()，nextDouble()，
        //nextFloat()的结束换行符作为字符串读入
        //，进而不需要从键盘输入字符串nextLine便已经转向了下一条语句执行
        /*解决方法：
        在每一个nextInt()，next()，nextDouble()，nextFloat()后都加一个nextLine()语句，将被next()去掉的Enter过滤掉*/
        sc.nextLine();
        String[] strs = new String[4];

        boolean flag;
        for(int i=0; i < t; i++){
            flag = false;
            for(int k =0 ;k<4;k++){
                strs[k] = sc.nextLine();
                //System.out.println(strs[k]);
            }
            for(int ii=0;ii<3;ii++){
                for(int j=0;j<3;j++){

                    if(strs[ii].charAt(j)==strs[ii].charAt(j+1)
                            &&strs[ii+1].charAt(j)==strs[ii+1].charAt(j+1)
                            &&strs[ii].charAt(j)==strs[ii+1].charAt(j+1))
                    {
                        flag =true;
                    }
                }
            }
            if(flag)System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
