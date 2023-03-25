package 数组相关;

/**
 * @title: no_2596_检查骑士巡视方案
 * @Author zxwyhzy
 * @Date: 2023/3/25 22:05
 * @Version 1.0
 */
public class no_2596_检查骑士巡视方案 {

    public static void main(String[] args) {
        int[][] arr = {{0,11,16,5,20},{17,4,19,10,15},{12,1,8,21,6},{3,18,23,14,9},{24,13,2,7,22}};
        new no_2596_检查骑士巡视方案().checkValidGrid(arr);
    }
    public boolean checkValidGrid(int[][] grid) {
        // 因为必须从左上角开始
        if (grid[0][0] != 0) return false;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (!okk(i,j,grid)){
                    return false;
                }
            }
        }
    return true;

    }
    public boolean okk(int i,int k,int[][] grid){

        if (grid[i][k] == (grid.length* grid.length) - 1) return true;

        // 水平右移两位 垂直下移一位
        if ((i+1 < grid.length && k+2< grid[0].length) && grid[i][k] + 1 == grid[i+1][k+2]){
            return true;
        }

        // 水平右移两位 垂直上移一位
        if ((i-1 >= 0 && k+2< grid[0].length) && grid[i][k] + 1 == grid[i-1][k+2]){
            return true;
        }
        // 水平左移两位 垂直下移一位
        if ((i+1 < grid.length && k-2 >= 0) && grid[i][k] + 1== grid[i+1][k-2]){
            return true;
        }

        // 水平左移两位 垂直上移一位
        if ((i-1 >= 0 && k-2 >= 0) && grid[i][k] + 1 == grid[i-1][k-2]){
            return true;
        }

        // 水平左移一位 垂直下移两位
        if ((i+2 < grid.length && k-1 >= 0) && grid[i][k]  + 1== grid[i+2][k-1]){
            return true;
        }

        // 水平右移一位 垂直下移两位
        if ((i+2 < grid.length && k+1 < grid[0].length) && grid[i][k] + 1 == grid[i+2][k+1]){
            return true;
        }
        // 水平左移一位 垂直上移两位
        if ((i-2 >= 0 && k-1 >= 0) && grid[i][k]  + 1== grid[i-2][k-1]){
            return true;
        }

        // 水平右移一位 垂直上移两位
        if ((i-2 >=0 && k+1 < grid[0].length) && grid[i][k] + 1 == grid[i-2][k+1]){
            return true;
        }
        return false;
    }
}
