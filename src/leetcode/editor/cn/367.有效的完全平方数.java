/*
 * @lc app=leetcode.cn id=367 lang=java
 *
 * [367] 有效的完全平方数
 */
class Solution {
    public boolean isPerfectSquare(int num) {
        //完全平方数可以表示为连续奇数的和
        //减去这个序列 若结果等于0 则为完全平方数
        for (int i = 1; num > 0; i+=2) {
            num-=i;
        }
        return num==0;
    }
}

