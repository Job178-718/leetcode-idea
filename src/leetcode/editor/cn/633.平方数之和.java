/*
 * @lc app=leetcode.cn id=633 lang=java
 *
 * [633] 平方数之和
 */
class Solution {
    public boolean judgeSquareSum(int c) {
        for (int i = 0; c-Math.pow(i, 2)>0; i++) {
            int x = c - (int)Math.pow(i, 2);
            int y = (int)Math.sqrt(x);
            if (y*y ==x) {
                return true;
            }
        }
        return c==0?true:false;
    }
}

