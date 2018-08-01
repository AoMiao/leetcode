package com.aoomiao.leetcode;

import java.util.Stack;

/**
* <p>
* 给定 n 个非负整数，用来表示柱状图中各个柱子的高度。每个柱子彼此相邻，且宽度为 1 。<p>
* 求在该柱状图中，能够勾勒出来的矩形的最大面积。
*/
public class LargestRectangleArea84 {

    public static void main(String[] args) {
        LargestRectangleArea84 a = new LargestRectangleArea84();
        a.largestRectangleArea(new int[]{1,1});
    }

    /**
     * 利用栈构建升序的柱形图，构建过程要把最大面积记录下来
     * 对升序数组：max(height[i]*(size-i))
     * 比如1,2,5,7,8
     * 那么就是(1*5) vs (2*4) vs (5*3) vs (7*2) vs (8*1)
     * 
     * https://www.cnblogs.com/ganganloveu/p/4148303.html
     */
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        for (int i = 0; i < heights.length; i++) {
            int count = 0;
            while(!stack.isEmpty()&&heights[i]<stack.peek()){
                max = Math.max(max, stack.pop()*++count);//把弹出的最大面积记录下来
            }
            while (count>0) {//弹出多少个就重新插入多少个
                count--;
                stack.push(heights[i]);
            }
            stack.push(heights[i]);
        }
        //获取升序柱形图的最大面积
        int count = 1;
        while (!stack.isEmpty()) {
            max = Math.max(max, stack.pop()*count++);
        }
        return max;
    }

}
