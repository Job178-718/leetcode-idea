/*
 * @lc app=leetcode.cn id=437 lang=java
 *
 * [437] 路径总和 III
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {

    public int pathSum(TreeNode root, int sum) {
 
        if(root==null) return 0;
        //当root为null时，代表递归的结束
 
        //分别判断以 1.当前root为路径起始点向下查找2.以root.left为路径起始点向下查找。3.以root.right为路径起
        //始点向下查找
 
        return pathSum(root.left,sum)+pathSum(root.right,sum)+FindPath(root,sum);
    }
    public static int FindPath(TreeNode root,int sum){//同样这也是一个递归操作
        if(root==null) return 0;
        //以root为起点，继续向下查找，知道找到了符合条件的路径，当找到后，对应的结果数增加1；
        return ((root.val==sum)?1:0)+FindPath(root.left,sum-root.val)+FindPath(root.right,sum-root.val);
 
    }
}
