package com.aoomiao.leetcode;
/**
* <p>
* 假设你正在爬楼梯。需要 n 步你才能到达楼顶。<p>
* 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
*/
public class DPLadder {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }
    
    /**
     * dp[1] = 1;
     * dp[2] = 2;
     * dp[3] = dp[3-1]+dp[3-2];
     * ....
     * dp[n] = dp[n-1]+dp[n-2];
     * 
     * 到达n层台阶有两种方式，一种是从n-1踏上来的，一种是从n-2踏上来的
     * @param n n层台阶
     * 注意：用递归会超时，因为计算重复的计算步骤
     */
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

}
