package 回溯;

import java.util.ArrayList;
import java.util.List;

/**
 * @title: no_51_N皇后
 * @Author zxwyhzy
 * @Date: 2023/11/2 15:56
 * @Version 1.0
 */
public class no_51_N皇后 {
    int[] queens;
    char[] chars;
    List<List<String>> ans = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        queens = new int[n];
        chars = new char[n];
        for (int i = 0; i < n; i++) {
            chars[i] = '.';
        }
        process(n, 0);

        return ans;
    }

    /**
     *
     * @param n 棋盘大小
     * @param cur 当前摆放列
     */
    private void process(int n, int cur) {
        if (cur == n) {
            List<String> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                chars[queens[i]] = 'Q';
                temp.add(new String(chars));
                chars[queens[i]] = '.';
            }
            ans.add(temp);
            return;
        }
        for (int i = 0; i < n; i++) {
            // 给 cur 列 的皇后摆在第 i 行
            queens[cur] = i;
            if (check(cur)) {
                process(n, cur + 1);
            }
        }
    }

    private boolean check(int cur) {
        for (int i = 0; i < cur; i++) {
            // 在同一行                         同一对角线    (一维数组不存在同一列的情况)
            if (queens[i] == queens[cur] || Math.abs(cur - i) == Math.abs(queens[i] - queens[cur])) {
                return false;
            }
        }
        return true;
    }

}
