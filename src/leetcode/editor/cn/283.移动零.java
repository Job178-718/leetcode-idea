/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */
class Solution {
    public void moveZeroes(int[] nums) {
        int temp;
        int idx = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				temp = nums[idx];
				nums[idx] = nums[i];
				nums[i] = temp; 
				idx++;
			}
		}
    }
}

