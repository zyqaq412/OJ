package 回溯.组合问题;

/**
 * @title: EightQueens
 * @Author zxwyhzy
 * @Date: 2023/11/2 16:01
 * @Version 1.0
 */
public class EightQueens {
    static int[] queens = new int[8];

    public static void main(String[] args) {
        new EightQueens().process(0);
    }
    private void process(int n) {
        if (n == 8) {
            print();
            return;
        }
        for (int i = 0; i < 8; i++) {
            queens[n] = i;
            if (check(n)) {
                process(n + 1);
            }
        }
    }

    private boolean check(int n) {
        for (int i = 0; i < n; i++) {
            // 在同一行                         同一对角线    (一维数组不存在同一列的情况)
            if (queens[i] == queens[n] || Math.abs(n-i) == Math.abs(queens[i] - queens[n])){
                return false;
            }
        }
        return true;
    }

    private void print() {
        for (int i : queens) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
