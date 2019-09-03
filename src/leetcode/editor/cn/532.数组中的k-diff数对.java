import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=532 lang=java
 *
 * [532] 数组中的K-diff数对
 */
class Solution {
    public int findPairs(int[] nums, int k) {
        int len = nums.length, result = 0;
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> sameSet = new HashSet<Integer>();
        if (k != 0) {
            for (int i = 0; i < len; i++) {
                if (!set.contains(nums[i]) && set.contains(nums[i] - k)) 
                    result++;
                set.add(nums[i]);
            }
        }
        else {
            for (int i = 0; i < len; i++) {
                if (!sameSet.contains(nums[i]) && set.contains(nums[i])) {
                    result++;
                    sameSet.add(nums[i]);
                }
                set.add(nums[i]);
            } 
        }
        return result;
    } 
}

