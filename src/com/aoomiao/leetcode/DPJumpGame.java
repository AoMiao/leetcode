package com.aoomiao.leetcode;

/**
* <p>
* 给定一个非负整数数组，你最初位于数组的第一个位置。<p>
* 数组中的每个元素代表你在该位置可以跳跃的最大长度。<p>
* 判断你是否能够到达最后一个位置。<p>
* 输入: [2,3,1,1,4]   <p>
* 输出: true          <p>
* 解释: 从位置 0 到 1 跳 1 步, 然后跳 3 步到达最后一个位置。
*/
public class DPJumpGame {

    public static void main(String[] args) {
        DPJumpGame a = new DPJumpGame();
        a.canJump(new int[] { 3, 2, 1, 0, 4 });

    }

    /**dp[i]:表达能否跳跃到i坐标
     * maxStep:表达i坐标之前最远能跳跃到的坐标
     * 
     * dp[0] = true
     * dp[1] = dp[0]&&maxStep>=1
     * dp[2] = dp[1]&&maxStep>=2
     * ...
     * dp[n] = dp[n-1]&&maxStep>=n
     * 
     */
    public boolean canJump(int[] nums) {
        if (nums.length <= 1) return true;
        boolean[] dp = new boolean[nums.length];
        dp[0] = true;
        int maxStep = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = dp[i - 1] && maxStep >= i;
            maxStep = Math.max(maxStep, i + nums[i]);
        }
        return dp[dp.length - 1];
    }

}
