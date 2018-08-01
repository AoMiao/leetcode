package com.aoomiao.leetcode;

/**
* <p>
* 输入: [2,3,1,1,4]   <p>
* 输出: 2             <p>
* 解释: 跳到最后一个位置的最小跳跃数是 2。 <p>
* 从下标为 0 跳到下标为 1 的位置，跳 1 步，然后跳 3 步到达数组的最后一个位置。
*/
public class DPJumpGameII {

    public static void main(String[] args) {

    }
    
    /**
     * dp[i]：表示跳跃到当前位置的最小跳跃数
     * 
     * dp[0] = 0;
     * dp[1] = 1;
     * dp[2] = 1;
     * dp[3] = 2
     * dp[n] = 从0~n-1遍历，直到 数值+下标>=i下标
     * 
     * 另一种算法:贪心算法
     */
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = 0;
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < i; j++) {
                if(nums[j]+j>=i){
                    dp[i] = dp[j]+1;
                    break;
                }
            }
        }
        return dp[dp.length-1];
    }
    
    /**
     * 每次只选跳的最远那次为遍历结束坐标判断，当遍历i超出最远距离时，步数+1，更新最大距离
     * @param nums
     * @return
     */
    public int jump2(int[] nums) {
        if(nums.length<=1) return 0;
        int maxLen = 0;
        int count = 1;
        int curr = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(i>curr){
                count++;
                curr = maxLen;
            }
            maxLen = Math.max(maxLen, nums[i]+i);
        }
        return count;
    }

}
