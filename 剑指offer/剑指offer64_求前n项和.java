public class 剑指offer64_求前n项和 {

    /*
     * 求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
     * 
     */
}

class Solution {
    public int sumNums(int n) {
        /* 
         * 这里我们用短路与来实现递归条件
         * n > 0,才会执行后面的递归
         */
        boolean flag = n > 0 && 0 < (n = n + sumNums(n - 1));

        return n;
    }
}