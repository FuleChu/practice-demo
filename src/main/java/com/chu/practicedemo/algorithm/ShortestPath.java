package com.chu.practicedemo.algorithm;

/**
 * @ClassName ShortestPath
 * @Description 给定一个矩阵m，从左上角开始每次只能向右或者向下走，最后到达右下角的位置，路径上所有的数字累加起来就是路径和，返回所有路径中最小的路径和。
 * 例子：
 * 给定m如下：
 * 1 3 5 9
 * 8 1 3 4
 * 5 0 6 1
 * 8 8 4 0
 * 路径1,3,1,0,6,1,0是所有路径中路径和最小的，所以返回12。
 * @Author chufule
 * @Date 2021/8/12 17:31
 * @Version 1.0
 */
public class ShortestPath {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,9},{8,1,3,4},{5,0,6,1},{8,8,4,0}};
        System.out.println(shortPath(matrix));
        System.out.println(dp(matrix));
        System.out.println(dp2(matrix));
    }

    public static int shortPath(int[][] matrix){
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
            return 0;
        }
        return process(matrix,0,0);
    }

    public static int process(int[][] matrix,int i,int j){

        if (i > matrix.length - 1 || j > matrix[0].length - 1) {
            return 0;
        }
        return matrix[i][j]+ Math.min(process(matrix,i+1,j), process(matrix,i,j+1));
    }

    public static int dp(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        //dp[i][j]表示从0，0位置到i,j位置最短路径的和
        int[][] dp = new int[row][col];
        dp[0][0] = matrix[0][0];
        //先填第一列，即从0，0到...,0的距离的和，只依赖上一个的数值
        for (int i = 1; i < row; i++) {
            dp[i][0] = dp[i-1][0] + matrix[i][0];
        }
        //再填第一行
        for (int j = 1; j < col; j++) {
            dp[0][j] = dp[0][j-1] + matrix[0][j];
        }
        for (int r = 1; r < row; r++) {
            for (int c = 1; c < col; c++) {
                dp[r][c] = Math.min(dp[r-1][c],dp[r][c-1]) + matrix[r][c];
            }
        }
        return dp[row-1][col-1];
    }

    /**
     * 压缩数组，当原matrix为很大的数组时，创建一个一样大小的dp数组较为浪费空间
     * 所以压缩二维数组成一维数组
     * 数组以列的长度为大小，从上往下依次每行求出数据，也可以以行的长度为大小，从左往右
     * @param matrix
     * @return
     */
    public static int dp2(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        //只使用一个一维数组，节省空间
        int[] dp = new int[col];
        dp[0] = matrix[0][0];
        //先算出0，0到第一行各个位置的距离
        for (int i = 1; i < col; i++) {
            dp[i] = dp[i-1] + matrix[0][i];
        }
        //再填剩下的行的值
        for (int j = 1; j < row; j++) {
            dp[0] = dp[0] + matrix[j][0];
            for (int c = 1; c < col; c++) {
                dp[c] = Math.min(dp[c-1],dp[c]) + matrix[j][c];
            }
        }
        return dp[col-1];
    }
}
