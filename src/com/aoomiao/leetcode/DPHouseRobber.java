package com.aoomiao.leetcode;

/**
* <p>
* 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。<p>
* 给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。
*/
public class DPHouseRobber {

    public static void main(String[] args) {
        DPHouseRobber a = new DPHouseRobber();
        a.rob(new int[]{1,2,3,1});
    }

    /**1231
     * 
     * dp[0] = 0
     * dp[1] = n[1]
     * dp[2] = max(dp[1],dp[0]+n[1])
     * dp[3] = max(dp[2],dp[1]+n[2])
     * dp[4] = max(dp[3],dp[2]+n[3])
     * dp[5] = max(dp[4],dp[3]+n[4])
     * ...
     * dp[n] = max(dp[n-1],dp[n-2]+n[n-1])
     */
    public int rob(int[] nums) {
        if(nums.length<1) return 0;
        int[] dp = new int[nums.length+1];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2]+nums[i-1]);
        }
        return dp[nums.length];
    }

}
