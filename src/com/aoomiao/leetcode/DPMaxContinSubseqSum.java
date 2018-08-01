package com.aoomiao.leetcode;

/**
* <p>
* 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
* [-2,1,-3,4,-1,2,1,-5,4]
*/
public class DPMaxContinSubseqSum {

    public static void main(String[] args) {
        DPMaxContinSubseqSum a = new DPMaxContinSubseqSum();
        a.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
    }

    /**dp[i] 表示以 n[i] 作为末尾(即n[i]一定在序列当中)的连续序列的最大和
     * 
     * dp[0]=n[0]
     * dp[1] = max(n[1],dp[0]+n[1])
     * dp[2] = max(n[2],dp[1]+n[2])
     * ....
     * dp[n] = Math.max(nums[n], dp[n-1]+nums[n]);
     * 
     * 即使进行了两次n遍历，时间还是O(n)
     */
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(nums[i], dp[i-1]+nums[i]);
        }
        //把dp最大那个选出来
        int max = dp[0];
        for (int i = 1; i < dp.length; i++) {
            if(dp[i]>max)max = dp[i];
        }
        return max;
    }

}
