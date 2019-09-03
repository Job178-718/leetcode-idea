/*
 * @lc app=leetcode.cn id=226 lang=java
 *
 * [226] 翻转二叉树
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
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        TreeNode tmp = root.right;
        root.right = root.left;
        root.left = tmp;
        if(root.left !=null){
            root.left = invertTree(root.left);
        }
        if(root.right!=null){
            root.right = invertTree(root.right);
        }
        return root;
    }
}

