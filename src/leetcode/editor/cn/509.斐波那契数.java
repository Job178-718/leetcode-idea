/*
 * @lc app=leetcode.cn id=509 lang=java
 *
 * [509] 斐波那契数
 */
class Solution {
    public int fib(int N) {
        if(N == 0) return 0;
        if(N == 1) return 1;
        return fib(N-1)+fib(N-2);
    }
}

