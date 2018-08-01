package com.aoomiao.leetcode;

/**
* https://leetcode-cn.com/problems/minimum-path-sum/description/<p>
* 给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。 <p>
* 说明：每次只能向下或者向右移动一步。
*/
public class DPMinimumPathSum64 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < grid.length; i++) {
            dp[i][0]=grid[i][0]+dp[i-1][0];
        }
        for (int i = 1; i < grid[0].length; i++) {
            dp[0][i]+=grid[0][i]+dp[0][i-1];
        }
        
        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[0].length; j++) {
                dp[i][j] = grid[i][j] + Math.min(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
