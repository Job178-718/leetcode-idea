import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=637 lang=java
 *
 * [637] 二叉树的层平均值
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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        List<TreeNode> list = new ArrayList<>();
        list.add(root);
        while(!list.isEmpty()){
            List<TreeNode> nextlist = new ArrayList<>();
            int count = 0;
            double sum = 0;
            for (TreeNode cur : list) {
                count++;
                sum += cur.val;
                if (cur.left!=null) nextlist.add(cur.left);
                if (cur.right!=null) nextlist.add(cur.right);
            }
            result.add(sum/count);
            list = nextlist;
        }
        return result;
    }
}

