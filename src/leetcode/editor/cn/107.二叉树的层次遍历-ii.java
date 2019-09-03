import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/*
 * @lc app=leetcode.cn id=107 lang=java
 *
 * [107] 二叉树的层次遍历 II
 *
 * https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii/description/
 *
 * algorithms
 * Easy (59.77%)
 * Total Accepted:    13.8K
 * Total Submissions: 23K
 * Testcase Example:  '[3,9,20,null,null,15,7]'
 *
 * 给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
 * 
 * 例如：
 * 给定二叉树 [3,9,20,null,null,15,7],
 * 
 * ⁠   3
 * ⁠  / \
 * ⁠ 9  20
 * ⁠   /  \
 * ⁠  15   7
 * 
 * 
 * 返回其自底向上的层次遍历为：
 * 
 * [
 * ⁠ [15,7],
 * ⁠ [9,20],
 * ⁠ [3]
 * ]
 * 
 * 
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        ArrayList<List<Integer>> list = new ArrayList<>();
        if(root==null){
            return list;
        }
        LinkedList<TreeNode> nodequeue = new LinkedList<>();
        LinkedList<Integer> depthqueue = new LinkedList<>();
        nodequeue.add(root);
        depthqueue.add(0);
        while (!nodequeue.isEmpty()) {
            TreeNode poll = nodequeue.poll();
            int depth = depthqueue.poll();
            if(list.size()==depth){
                list.add(0,new ArrayList<>());
            }
            list.get(0).add(poll.val);
            if (poll.left != null) {
                nodequeue.add(poll.left);
                depthqueue.add(depth+1);
            }
            if (poll.right != null) {
                nodequeue.add(poll.right);
                depthqueue.add(depth+1);
            }
        }
        return list;
    }
}
