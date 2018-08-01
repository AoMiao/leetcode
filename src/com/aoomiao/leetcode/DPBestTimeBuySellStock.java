package com.aoomiao.leetcode;

/**
* <p>
* 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。<p>
* 如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。<p>
* 注意你不能在买入股票前卖出股票
* [7,1,5,3,6,4]
* dp[i]:0到i之间所能获取最大利润
*/
public class DPBestTimeBuySellStock {

    public static void main(String[] args) {

    }

    /**
     * min:i坐标之前的数组最小值
     * dp[0] = 0;
     * dp[1] = max(dp[0],n[1]-min);
     * dp[2] = max(dp[1],n[0]-min);
     * ...
     * dp[n] = max(dp[n-1],n[n]-min);
     */
    public int maxProfit(int[] prices) {
        if(prices.length<1) return 0;
        int[] dp = new int[prices.length];
        dp[0] = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < prices.length; i++) {
            min = Math.min(min, prices[i-1]);
            dp[i] = Math.max(dp[i-1], prices[i]-min);
        }
        return dp[dp.length-1];
    }

}
