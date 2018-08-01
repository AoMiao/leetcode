package com.aoomiao.leetcode;
/**
* <p>
* create by AooMiao on 2018-06-22
*/
public class TreeNode {
    @Override
    public String toString() {
        return "TreeNode [val=" + val + ", left=" + left + ", right=" + right + "]";
    }

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
