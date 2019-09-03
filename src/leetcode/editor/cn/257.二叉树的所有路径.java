/*
 * @lc app=leetcode.cn id=257 lang=java
 *
 * [257] 二叉树的所有路径
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
    List<String> res = new ArrayList();
    public List<String> binaryTreePaths(TreeNode root) {
        helper(root,new String());
        return res;
    }
    public void helper(TreeNode root,String str) {
        if (root==null) return;
        if (root.left==null && root.right==null) {
            str+=root.val;
            res.add(str);
            return;
        } else {
            helper(root.left,str+root.val+"->");
            helper(root.right,str+root.val+"->");
        }
    }
}

