/*
 * @lc app=leetcode.cn id=617 lang=java
 *
 * [617] 合并二叉树
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
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t2 == null) {
            return t1;
        }
        if (t1 == null){
            return t2;
        }
        firstOrder(t1, t2);
        return t1;
    }
    public static void firstOrder(TreeNode t1,TreeNode t2) {
        t1.val+=t2.val;
        if (t1.left!=null &&t2.left!=null) {
            firstOrder(t1.left, t2.left);
        }else {
            if (t1.left==null && t2.left !=null) {
                t1.left = t2.left;
            }
        }
        if (t1.right!=null &&t2.right!=null) {
            firstOrder(t1.right, t2.right);
        }else {
            if (t1.right==null && t2.right !=null) {
                t1.right = t2.right;
            }
        }
        return;
    }
}

