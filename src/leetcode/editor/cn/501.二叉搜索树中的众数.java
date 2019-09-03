import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=501 lang=java
 *
 * [501] 二叉搜索树中的众数
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
    private Map<Integer,Integer>map;
    private int max = 0;
    public int[] findMode(TreeNode root) {
        if(root == null) return new int[0];
        this.map = new HashMap<>();
        inOrder(root);
        List<Integer> list = new LinkedList<>();
        for(int key :map.keySet()){
            if(map.get(key) == max){
                list.add(key);
            }
        }
        int [] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
    private void inOrder(TreeNode root){
        if(root.left != null){
            inOrder(root.left);
        }
        map.put(root.val,map.getOrDefault(root.val, 0)+1);
        max = Math.max(max, map.get(root.val));
        if(root.right != null){
            inOrder(root.right);
        }
    }
}

