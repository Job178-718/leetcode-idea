/*
 * @lc app=leetcode.cn id=598 lang=java
 *
 * [598] 范围求和 II
 */
class Solution {

    public int maxCount(int m, int n, int[][] ops) {
        int heigh = m;
        int width = n;
        if(ops.length == 0){
            return m*n;
        }
        for (int i = 0; i < ops.length; i++) {
            heigh = Math.min(heigh, ops[i][0]);
            width = Math.min(width, ops[i][1]);
        }
        return heigh*width;
    }
}
