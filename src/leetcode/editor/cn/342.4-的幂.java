/*
 * @lc app=leetcode.cn id=342 lang=java
 *
 * [342] 4的幂
 */
class Solution {
    public boolean isPowerOfFour(int num) {
        return ((num & (num-1)) == 0) && num > 0 && ((num  & 0x55555555) != 0);
    }
}

