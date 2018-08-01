package com.aoomiao.leetcode;

/**
* https://leetcode-cn.com/problems/cherry-pickup/description/<p>
* 一个N x N的网格(grid) 代表了一块樱桃地，每个格子由以下三种数字的一种来表示：<p>
* 0 表示这个格子是空的，所以你可以穿过它。<p>
* 1 表示这个格子里装着一个樱桃，你可以摘到樱桃然后穿过它。<p>
* -1 表示这个格子里有荆棘，挡着你的路。<p>
* 你的任务是在遵守下列规则的情况下，尽可能的摘到最多樱桃：<p>

* 从位置 (0, 0) 出发，最后到达 (N-1, N-1) ，只能向下或向右走，并且只能穿越有效的格子（即只可以穿过值为0或者1的格子）；<p>
* 当到达 (N-1, N-1) 后，你要继续走，直到返回到 (0, 0) ，只能向上或向左走，并且只能穿越有效的格子；<p>
* 当你经过一个格子且这个格子包含一个樱桃时，你将摘到樱桃并且这个格子会变成空的（值变为0）；<p>
* 如果在 (0, 0) 和 (N-1, N-1) 之间不存在一条可经过的路径，则没有任何一个樱桃能被摘到。<p>
* 
* [[0, 1, -1],  <p>
*  [1, 0, -1],  <p>
*  [1, 1,  1]]
*/
public class DPCherryPickup714 {

    public static void main(String[] args) {

    }
    
    /**
     * 
     * 
     */
    public int cherryPickup(int[][] grid) {
        int[][] dp = new int[grid.length][grid.length];
        
        
        
        
        return 0;
    }
}
