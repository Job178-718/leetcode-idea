/*
 * @lc app=leetcode.cn id=453 lang=java
 *
 * [453] 最小移动次数使数组元素相等
 */
class Solution {
    public int minMoves(int[] nums) {
        int sum=0;
        int min = nums[0];
        for (int i = 0; i < nums.length;i++) {
            if(nums[i]<=min){
                min = nums[i];
            }
            sum += nums[i];
        }
        return sum - nums.length*min;
    }
}

