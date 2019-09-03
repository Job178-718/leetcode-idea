/*
 * @lc app=leetcode.cn id=189 lang=java
 *
 * [189] 旋转数组
 */
class Solution {
    public void rotate(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            moveOneStep(nums);
        }
    }
    public static void moveOneStep(int[] nums){
        int temp = nums[nums.length-1];
        for (int i = nums.length-2; i >=0 ; i--) {
             nums[i+1] = nums[i];
        }
        nums[0] = temp;
    }
}

