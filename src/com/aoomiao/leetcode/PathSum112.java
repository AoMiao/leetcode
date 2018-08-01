package com.aoomiao.leetcode;

/**
* https://leetcode-cn.com/problems/path-sum/description/<p>
* 给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。<p>
* 说明: 叶子节点是指没有子节点的节点。
*/
public class PathSum112 {
    
    public static void main(String[] args) {
        PathSum112 a = new PathSum112();
        TreeNode root = new TreeNode(-2);
        root.left = null;
        root.right = new TreeNode(-3);
        System.out.println(a.hasPathSum(root, -5));
    }
    
    public boolean hasPathSum(TreeNode root, int sum) {
        boolean res = false;
        if(root==null) return res;
        
        res = pathSum(root,sum);
        return res;
    }
    
    public boolean pathSum(TreeNode root, int sum){
        if (root!=null&&root.left == null && root.right == null && sum == root.val) return true;
        if (root==null)  return false;
        
        boolean res = pathSum(root.left,sum-root.val);
        if(!res){
            res = pathSum(root.right,sum-root.val);
        }
        return res;
    }
    

}
