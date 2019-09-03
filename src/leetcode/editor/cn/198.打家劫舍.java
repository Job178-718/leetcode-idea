/*
 * @lc app=leetcode.cn id=198 lang=java
 *
 * [198] 打家劫舍
 */
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) {
			return 0;
		}
        
		int[] f = new int[n];
		if (n == 1) {
			return nums[0];
		}
        
		int a = Math.max(nums[0], nums[1]);
		if (n == 2) {
			return a;
		}
		
		f[0] = nums[0];
		f[1] = a;
		
		for (int i = 2; i < f.length; i++) {
			f[i] = Math.max(f[i - 2] + nums[i], f[i -1]);
		}
		return f[n - 1];
    }
}

