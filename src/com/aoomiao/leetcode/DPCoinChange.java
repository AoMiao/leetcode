package com.aoomiao.leetcode;

/**
* <p>
* 给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。<p>
* 如果没有任何一种硬币组合能组成总金额，返回 -1。<p>
* 输入: coins = [1, 2, 5], amount = 11<p>
* 输出: 3                             <p>
* 解释: 11 = 5 + 5 + 1
*/
public class DPCoinChange {

    public static void main(String[] args) {
        //2 3 5  10
    }
    
    
    /**
     * dp[i]:表示筹够金额i所需要的最少硬币数
     * 
     * dp[0] = 0
     * dp[1] = dp[1-1]+1
     * dp[2] = dp[2-1]+1
     * dp[3] = min(dp[3-1]+1,dp[3-2]+1)
     * dp[5] = min(dp[5-1]+1,dp[5-2]+1,dp[5-5]+1)
     * ...
     * dp[amount] = min(dp[amount-coins[0]]+1,dp[amount-coins[1]]+1,dp[amount-coins[2]]+1,......,dp[amount-coins[coins.len-1]]+1)
     * 上面的式子可简化为:dp[amount] = min(dp[amount-coins[j]]+1,dp[amount])
     * j:代表遍历coins的下表,dp[amount]保存上一次dp[amount]的小值
     * 
     * 第一次遍历从0~amount,第二次遍历从0~coins.len
     * [2]  3
     */
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        dp[0] = 0;
        for (int i = 1; i < dp.length; i++) {
            dp[i] = Integer.MAX_VALUE-1;//防止+1溢出，所以减一
        }
        
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < coins.length; j++) {
                if(i>=coins[j]){
                    dp[i] = Math.min(dp[i-coins[j]]+1, dp[i]);
                }
            }
        }
        return dp[amount]==Integer.MAX_VALUE-1?-1:dp[amount];
    }

}
