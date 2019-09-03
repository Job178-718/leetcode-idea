/*
 * @lc app=leetcode.cn id=122 lang=java
 *
 * [122] 买卖股票的最佳时机 II
 */
class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0)
            return 0;
        int max = 0, min = prices[0], maxtemp = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i]<prices[i-1]) {
                max += maxtemp;
                min = prices[i];
                maxtemp = 0;
            }else{
                maxtemp= prices[i]-min;
            }
        }
        return max+maxtemp;
    }
}
