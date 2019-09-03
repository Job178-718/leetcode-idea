/*
 * @lc app=leetcode.cn id=268 lang=java
 *
 * [268] 缺失数字
 */
class Solution {
    public int missingNumber(int[] nums) {
        int sum_i=0;
        int sum_ac=0;
        for(int i=0;i<nums.length;i++){
            sum_i+=i;
            sum_ac+=nums[i];
        }
        sum_i+=nums.length;
        return sum_i-sum_ac;
    }
}

