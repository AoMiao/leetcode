package com.aoomiao.leetcode;

/**
* <p>
* 一个机器人位于一个 m x n 网格的左上角<p>
* 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角<p>
* 问总共有多少条不同的路径
*/
public class DPUniquePaths {

    public static void main(String[] args) {

    }

    /**dp[i][j]:表示到达坐标(i,j)总共有多少条路径可以到达这个坐标,并且能到达这个坐标的前面的坐标只能是(i-1,j)或者(i,j-1)
     * 
     * dp[0][*]:第一行的每一格都是1，因为机器人只能向右或向下移动
     * dp[*][0]:第一列的每一格都是1，因为机器人只能向右或向下移动
     * dp[1][1] = dp[0][1] + dp[1][0]
     * dp[1][2] = dp[0][1] + dp[1][1]
     * ...
     * dp[m][n] = dp[m-1][n] + dp[m][n-1]
     */
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {//第一列的每一格都是1
            dp[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {//第一行的每一格都是1
            dp[0][j] = 1;
        }
        for (int i = 1; i < dp.length; i++) {//遍历行
            for (int j = 1; j < dp[0].length; j++) {//遍历列
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }

}
