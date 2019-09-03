/*
 * @lc app=leetcode.cn id=461 lang=java
 *
 * [461] 汉明距离
 */
class Solution {
    public int hammingDistance(int x, int y) {
        int ham = x^y;
        int result =0;
        while(ham>0){
            ham = ham &(ham-1);
            result++;
        }
        return result;
    }
}
