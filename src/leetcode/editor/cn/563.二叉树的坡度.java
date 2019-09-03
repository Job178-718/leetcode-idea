/*
 * @lc app=leetcode.cn id=563 lang=java
 *
 * [563] 二叉树的坡度
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
class Solution {
    int sum = 0;
    public int findTilt(TreeNode root) {
        sumChild(root);
        return sum;
    }
    public int sumChild(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = sumChild(root.left);
        int right = sumChild(root.right);
        sum += Math.abs(left-right);
        return left+right+root.val;
    }
}

