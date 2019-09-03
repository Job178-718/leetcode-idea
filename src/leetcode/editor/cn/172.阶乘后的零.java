/*
 * @lc app=leetcode.cn id=172 lang=java
 *
 * [172] 阶乘后的零
 */
class Solution {
    public int trailingZeroes(int n) {
        if (n <= 4) {
            return 0;
        }
        int result = 0;
        while (n != 0) {
            result += n / 5;
            n = n / 5;
        }
        return result;
    }
}

