package hzy.T2022.T10_20;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @title: XiaoMingAiZhiShu
 * @Author zxwyhzy
 * @Date: 2022/10/20 19:52
 * @Version 1.0
 * 重庆移通学院第六届ACM程序设计比赛练习赛
 *
 * 小明是个喜欢数学的人，这天老师交给他一个问题，给定m个区间l , r，求出这个区间内有多少个质数。 质数的定义是一个数除了1和它本身没有别的因子。 小明看到这个数据范围好像不对劲，1 <= m <= 1e6 , 1 <= l , r <= 1e7，于是他犯难了。他想让你来帮助他统计所有的答案。
 * 输入描述:
 *      一行一个整数m。
 *      接下来m行，每行两个整数l,r。
 * 输出描述:
 *      m行，每行代表到这个区间内质数的数量。
 */
public class XiaoMingAiZhiShu {
    private final static int MAX= 10000000;
    private  static int count=0;
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new BufferedInputStream(System.in);
        InputReader reader = new InputReader(inputStream);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] cnt = new int[MAX+1];
        int m=reader.nextInt();
        primer(cnt);
        for(int i=0;i<m;i++){
            int l= reader.nextInt();
            int r= reader.nextInt();
//            System.out.println(l+" "+r);
            writer.write(cnt[r]-cnt[l-1]+"\n");
        }
        writer.close();
    }


    private static void primer(int[] cnt){
        boolean[] st = new boolean[MAX+1];
        for(int i=2;i<=MAX;i++){
            cnt[i]=cnt[i-1];
            if(st[i]) {
                continue;
            }
            cnt[i]++;
            for(int j=i;j<=MAX;j+=i){
                st[j]=true;
            }
        }
    }


    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }


        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}
