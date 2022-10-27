package hzy.T2022.T10_23;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @title: XiaoMingAiZhiShu
 * @Author zxwyhzy
 * @Date: 2022/10/23 23:01
 * @Version 1.0
 *
 * 重庆移通学院第六届ACM程序设计比赛练习赛
 * 链接：https://ac.nowcoder.com/acm/contest/43885/C
 * 来源：牛客网
 *
 * 小明是个喜欢数学的人，这天老师交给他一个问题，给定m个区间l , r，求出这个区间内有多少个质数。 质数的定义是一个数除了1和它本身没有别的因子。 小明看到这个数据范围好像不对劲，1 <= m <= 1e6 , 1 <= l , r <= 1e7，于是他犯难了。他想让你来帮助他统计所有的答案。
 * 输入描述:
 * 一行一个整数m。
 * 接下来m行，每行两个整数l,r。
 * 输出描述:
 * m行，每行代表到这个区间内质数的数量。
 */
public class XiaoMingAiZhiShu {
    final static int MAX = 10000000;
    public static void main(String[] args) {
        int[] arr = new int[MAX+1];
        primer(arr);
        //Scanner sc =new Scanner(System.in);
        Input sc = new Input();
        int m = sc.nextInt();
        int l  ;
        int r  ;
        StringBuffer bw =new  StringBuffer();
        for (int k = 0 ; k< m ; k++){
            l = sc.nextInt();
            r = sc.nextInt();

            bw.append((arr[r]-arr[l-1])).append("\n");
        }
        System.out.println(bw);

    }

    private static void primer(int[] cnt){
        boolean[] st = new boolean[MAX+1];//10000001
        //最后数组 cnt[10/9/8] = 4,代表0-10/9/8 之间的质数为4 cnt{0, 0, 1, 2, 2, 3, 3, 4, 4, 4, 4} 质数个数
        //                                                    0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 下标
        for(int i=2;i<=MAX;i++){
            cnt[i]=cnt[i-1];
            if(st[i]) {
                continue;//终止当前循环，开始下一次循环
            }
            cnt[i]++;
            for(int j=i;j<=MAX;j+=i){
                st[j]=true;
            }
        }
    }
    static class Input {
        BufferedReader buf;
        StringTokenizer tok;

        Input() {
            buf = new BufferedReader(new InputStreamReader(System.in));
        }

        boolean hasNext() {
            while (tok == null || !tok.hasMoreElements()) {
                try {
                    tok = new StringTokenizer(buf.readLine());
                } catch (Exception e) {
                    return false;
                }
            }
            return true;
        }

        String next() {
            if (hasNext())
                return tok.nextToken();
            return null;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
