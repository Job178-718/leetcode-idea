import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=628 lang=java
 *
 * [628] 三个数的最大乘积
 */
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int lens = nums.length;
        if (nums[lens-1]<0){
            return nums[lens-1]*nums[lens-2]*nums[0];
        }
        return Math.max(nums[lens-1]*nums[lens-2]*nums[lens-3], nums[1]*nums[0]*nums[lens-1]);
    }
}
