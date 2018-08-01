package com.aoomiao.leetcode;

/**
* <p>
* 编写一个函数来计算确保骑士能够拯救到公主所需的最低初始健康点数。<p>
* 例如，考虑到如下布局的地下城，如果骑士遵循最佳路径 右 -> 右 -> 下 -> 下，则骑士的初始健康点数至少为 7。<p>
* -2 (K)     -3   3        <p>
* -5        -10   1        <p>
*  10        30  -5 (P)    <p>
*/
public class DPDungeonGame174 {

    public static void main(String[] args) {
        DPDungeonGame174 a = new DPDungeonGame174();
        int[][] dungeon = new int[][]{{-2,-3,3},{-5,-10,1},{10,30,-5}};
        a.calculateMinimumHP(dungeon);
    }

    /**
     * 
     * 
     */
    public int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length;
        int n = dungeon[0].length;
        int dp[][] = new int[m][n];
        dp[m-1][n-1] = dungeon[m-1][n-1] < 0 ? -1 * dungeon[m-1][n-1] + 1 : 1;
        //初始化最后一列和最后一行
        for(int i=m-2;i>=0;i--){
            dp[i][n-1] = Math.max(dp[i+1][n-1] - dungeon[i][n-1],1);
            System.out.println(String.format("dp[%s,%s]:%s", i,n-1,dp[i][n-1]));
        }
        for(int i=n-2;i>=0;i--){
            dp[m-1][i] = Math.max(dp[m-1][i+1] - dungeon[m-1][i],1);
            System.out.println(String.format("dp[%s,%s]:%s", m-1,i,dp[m-1][i]));
        }
        for(int i = m-2;i >= 0;i--){
            for(int j = n-2;j >= 0;j--){
                int tempMin = Math.min(dp[i][j+1]-dungeon[i][j],dp[i+1][j]-dungeon[i][j]);
                dp[i][j] = Math.max(1, tempMin);
            }
        }
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j]+"\t");
            }
            System.out.println();
        }
        return dp[0][0];
    }
}
