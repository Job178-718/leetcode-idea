import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=204 lang=java
 *
 * [204] 计数质数
 */

class Solution {
    public int countPrimes(int n) {
        if (n <= 1) {
            return 0;
        }
        // 默认为false
        boolean[] isPrime = new boolean[n];
        isPrime[0] = true;
        isPrime[1] = true;
        for (int i = 2; i * i < n; i++) {
            if (!isPrime[i]) {
                for (int j = i * 2; j < n; j += i) {
                    isPrime[j] = true;
                }
            }
        }
        // 统计质数个数
        int result = 0;
        for (boolean b : isPrime) {
            if (!b) {
                result++;
            }
        }

        return result;
    }
}
