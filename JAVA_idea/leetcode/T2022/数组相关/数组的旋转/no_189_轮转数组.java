package 数组相关.数组的旋转;

/**
 * @title: no_189_轮转数组
 * @Author zxwyhzy
 * @Date: 2022/11/8 23:01
 * @Version 1.0
 */
public class no_189_轮转数组 {
    public static void main(String[] args) {
       int[] nums =new int[]{1, 2, 3, 4, 5, 6, 7};
       int k = 3 ;
        rotate(nums,k);
    }



    public static void rotate(int[] nums, int k) {
        int len =nums.length;
        int[] temp = new int[len];
        for (int i = 0; i< len;i++){
            temp[(i+k)%len] = nums[i];
        }
        //复制数组
        System.arraycopy(temp, 0, nums, 0,len);
        //这么写自己测试能过，oj输出无变化
        /*System.out.print("[");
        for (int i =0;i<len;i++) {
            System.out.print(temp[i]);
            if (!(i==len-1))
            System.out.print(",");
        }
        System.out.print("]");*/
    }
    //
    public void rotate2(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int count = gcd(k, n);
        for (int start = 0; start < count; ++start) {
            int current = start;
            int prev = nums[start];
            do {
                int next = (current + k) % n;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
            } while (start != current);
        }
    }

    public int gcd(int x, int y) {
        return y > 0 ? gcd(y, x % y) : x;
    }

}
