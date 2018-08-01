package com.aoomiao.leetcode;

/**
* <p>
* 给定一个仅包含 0 和 1 的二维二进制矩阵，找出只包含 1 的最大矩形，并返回其面积。<p>
* 输入:<p>
* [                       <p>
*   ["1","0","1","0","0"],<p>
*   ["1","0","1","1","1"],<p>
*   ["1","1","1","1","1"],<p>
*   ["1","0","0","1","0"] <p>  
* ]                       <p>
* 输出: 6
*/
public class DPMaxRectangle85 {

    public static void main(String[] args) {
        char a = '1';
        int b = a-'0';
        System.out.println(b);
    }

    /**
     * 解法暂定
     */
    public int maximalRectangle(char[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = matrix[i][0]-'0';
        }
        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j] = matrix[0][j]-'0';
        }
        int row = 1;
        int col = 1;
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[i].length; j++) {
                if(matrix[i][j]=='0'){
                    dp[i][j] = 0;
                }
                if(matrix[i-1][j]=='1'&&matrix[i][j-1]=='1'){
                    
                }
                dp[i][j] = row*col;
                if (matrix[i-1][j]=='0'){//上边有0
                    col = 1;
                }
                if (matrix[i][j-1]=='0') {//左边有0
                    row = 1;
                }
            }
        }
        return 0;
    }

}
