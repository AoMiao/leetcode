package com.aoomiao.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
* 二叉树中序遍历(左中右)<p>
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
public class BinaryTreeInorderTraversal94 {

    
    public static void main(String[] args) {

    }
    
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        list = recursion(root, list);
        return list;
    }
    
    public List<Integer> recursion(TreeNode node,List<Integer> list){
        if(node==null) return list;
        recursion(node.left, list);
        list.add(node.val);
        recursion(node.right, list);
        return list;
    }
    
}


