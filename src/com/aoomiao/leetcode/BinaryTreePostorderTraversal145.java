package com.aoomiao.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
* 二叉树后序遍历(左右中)<p>
* create by AooMiao on 2018-06-22
*/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BinaryTreePostorderTraversal145 {

    public static void main(String[] args) {
        
    }
    
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        list = recursion(root, list);
        return list;
    }
    
    public List<Integer> recursion(TreeNode node,List<Integer> list){
        if(node==null) return list;
        recursion(node.left, list);
        recursion(node.right, list);
        list.add(node.val);
        return list;
    }
}
