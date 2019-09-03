/*
 * @lc app=leetcode.cn id=476 lang=java
 *
 * [476] 数字的补数
 */
class Solution {
    public int findComplement(int num) {
        // ~num 取反
        //Integer.highestOneBit(num) 取最高位
        return ~num & (Integer.highestOneBit(num) - 1);
    }
}

