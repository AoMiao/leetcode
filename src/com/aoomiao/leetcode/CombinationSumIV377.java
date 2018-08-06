package com.aoomiao.leetcode;

/**
* 
* 给定一个由正整数组成且不存在重复数字的数组，找出和为给定目标正整数的组合的个数。<p>
* nums = [1, 2, 3]  <p>
* target = 4    <p>
* 所有可能的组合为： <p>
* (1, 1, 1, 1)  <p>
* (1, 1, 2) <p>
* (1, 2, 1) <p>
* (1, 3)    <p>
* (2, 1, 1) <p>
* (2, 2)    <p>
* (3, 1)    <p>
* 请注意，顺序不同的序列被视作不同的组合。
* 因此输出为 7。
*/
public class CombinationSumIV377 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    /**
     * dp[i]:表示数字i有多少个组合
     * dp[0]:默认1
     * dp[1]:1-num[0]=0,而组成0的组合数上面得出1，总共有1种
     * dp[2]:2-num[0]=1,而组成1的组合数上面得出1;下一个遍历2-num[1]=0,组成0的组合数上面得出1，总共有1+1=种
     * dp[3]:3-num[0]=2,而组成2的组合数上面得出2;下一个遍历3-num[1]=1,组成1的组合数上面得出1,下一个遍历3-num[2]=0,组成0的组合数上面得出1，总共有2+1+1=4种
     * ...
     * dp[n]:dp[n] = sum(dp[i-num[j]])
     * 针对每个i，都遍历一次nums，当i比num当前遍历值大就计算规划公式
     */
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target+1];
        dp[0] = 1;
        
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(i>=nums[j]){
                    dp[i] += dp[i-nums[j]];
                }
            }
        }
        return dp[target];
    }
}
