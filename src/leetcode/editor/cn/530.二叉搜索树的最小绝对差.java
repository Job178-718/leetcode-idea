/*
 * @lc app=leetcode.cn id=530 lang=java
 *
 * [530] 二叉搜索树的最小绝对差
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public int min = Integer.MAX_VALUE;
    int temp;
    public int getMinimumDifference(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return 0;
        }
        temp = Integer.MAX_VALUE;
        inOrder(root);
        return min;
    }
    private void inOrder(TreeNode root){
        if(root.left!=null){
            inOrder(root.left);
        }
        min = Math.min(min,Math.abs(root.val-temp));
        temp = root.val;
        if(root.right != null){
            inOrder(root.right);
        }
    }
}
