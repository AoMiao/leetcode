package com.aoomiao.leetcode;

/**
* <p>
* create by AooMiao on 2018-08-09
*/
public class DPFrogJump403 {

    public static void main(String[] args) {

    }

    /**
     * [0,1,3,5,6,8,12,17]
     * 第0,1,3,5,6,8,12,17的单元格上面有石子
     * 开始处于0，只可以跳一个
     * 跳到1单元格，有石子，此时可以跳的距离1~2
     * 跳到3单元格(跳了2距离),有石子，此时可以跳的距离1~3
     * 跳到5单元格(跳了2距离),有石子，此时可以跳的距离1~3
     * 跳到8单元格(跳了3距离),有石子，此时可以跳的距离2~4
     * 跳到12单元格(跳了4距离),有石子，此时可以跳的距离3~5
     * 跳到17单元格(跳了5距离),有石子，最后的一个石子，返回true
     * 
     * 
     */
    public boolean canCross(int[] stones) {
        return false;
    }

}
