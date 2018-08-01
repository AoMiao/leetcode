package com.aoomiao.leetcode;

/**
* <p>
* create by AooMiao on 2018-07-23
* 
* 给定一个正整数 n，将其拆分为至少两个正整数的和，并使这些整数的乘积最大化。 返回你可以获得的最大乘积。<p>
* 例如，给定 n = 2，返回1（2 = 1 + 1）；给定 n = 10，返回36（10 = 3 + 3 + 4）。<p>
* 注意：你可以假设 n 不小于2且不大于58。
*/
public class DPIntegerBreak343 {

    public static void main(String[] args) {

    }

    /**
     * dp[2]:1*1 1
     * dp[3]:2*1 2
     * dp[4]:2*2 4
     * dp[5]:3*2 6
     * dp[6]:3*3 9
     * dp[7]:dp[4]*3 12
     * dp[8]:dp[5]*3 18
     * dp[9]:dp[6]*3 27
     * dp[10]:dp[7]*3 36
     * dp[11]:dp[8]*3 54
     * dp[12]:dp[9]*3 81
     * if(n>=7) dp[n] = dp[n-3]*3
     */
    public int integerBreak(int n) {
        int[] dp = new int[n+1];
        dp[2] = 1;
        if(n>=3)dp[3] = 2;
        if(n>=4)dp[4] = 4;
        if(n>=5)dp[5] = 6;
        if(n>=6)dp[6] = 9;
        for (int i = 7; i <= n; i++) {
            dp[i] = dp[i-3]*3;
        }
        return dp[n];
    }

}
