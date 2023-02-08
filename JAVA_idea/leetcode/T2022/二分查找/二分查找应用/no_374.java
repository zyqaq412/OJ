package 二分查找.二分查找应用;

/**
 * @title: no_374
 * @Author zxwyhzy
 * @Date: 2023/2/8 22:03
 * @Version 1.0
 *
 * 猜数字游戏的规则如下：
 *
 * 每轮游戏，我都会从 1 到 n 随机选择一个数字。 请你猜选出的是哪个数字。
 * 如果你猜错了，我会告诉你，你猜测的数字比我选出的数字是大了还是小了。
 * 你可以通过调用一个预先定义好的接口 int guess(int num) 来获取猜测结果，返回值一共有 3 种可能的情况（-1，1 或 0）：
 *
 * -1：我选出的数字比你猜的数字小 pick < num
 * 1：我选出的数字比你猜的数字大 pick > num
 * 0：我选出的数字和你猜的数字一样。恭喜！你猜对了！pick == num
 * 返回我选出的数字。
 *
 *
 */
public class no_374 {
    int pick = 6;

    public static void main(String[] args) {
        int i = new no_374().guessNumber(10);
        System.out.println(i);
    }
    public int guessNumber(int n) {
        //int l =1,r = n,mid;
        long l =1,r = n,mid;

        while (l<=r){
            mid =(l+r)/2;
            if (guess((int) mid) == 0) return (int) mid;
            else if (guess((int) mid) == -1) {
                r = mid-1;
            }else {
                l = mid+1;

            }

        }
        return 0;
    }
     public int guess(int n){
        if (n == pick) return 0;
        if (n < pick) return -1;
        return 1;
     }
}
