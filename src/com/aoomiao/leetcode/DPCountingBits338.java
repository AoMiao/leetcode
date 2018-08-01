package com.aoomiao.leetcode;

/**
* https://leetcode-cn.com/problems/counting-bits/description/<p>
* 给定一个非负整数 num。 对于范围 0 ≤ i ≤ num 中的每个数字 i ，计算其二进制数中的1的数目并将它们作为数组返回。<p>
* 比如给定 num = 5 ，应该返回 [0,1,1,2,1,2].
*/
public class DPCountingBits338 {

    public static void main(String[] args) {

    }

    /**
     * dp[0]:  0000   0
     * dp[1]:  0001   1
     * dp[2]:  0010   1
     * dp[3]:  0011   2
     * dp[4]:  0100   1
     * dp[5]:  0101   2
     * dp[6]:  0110   2
     * dp[7]:  0111   3
     * dp[8]:  1000   1
     * ...
     * dp[n] = dp[n/2]+dp[n%2]
     * 或者   偶数：dp[n] = dp[n/2]   奇数:dp[n] = dp[n/2]+1(因为n-1必为偶数)
     */
    public int[] countBits(int num) {
        int[] dp = new int[num+1];
        if(num<=0) return dp;
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i/2]+dp[i%2];
        }
        return dp;
    }

}
