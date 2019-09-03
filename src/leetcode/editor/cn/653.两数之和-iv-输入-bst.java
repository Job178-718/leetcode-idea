/*
 * @lc app=leetcode.cn id=653 lang=java
 *
 * [653] 两数之和 IV - 输入 BST
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
    //参见两数之和和二叉树遍历
    public boolean findTarget(TreeNode root, int k) {
        if(root==null)return false;
       Stack<TreeNode> stack=new Stack<>();
        HashSet<Integer> set=new HashSet<>();
        while(root!=null || !stack.isEmpty()){
            while(root!=null){
                stack.push(root);
                root=root.left;
            }
            root=stack.pop();
            if(set.contains(root.val)) 
                return true;
            else 
                set.add(k-root.val);
            root=root.right;
           }
        return false;   
    }
}

