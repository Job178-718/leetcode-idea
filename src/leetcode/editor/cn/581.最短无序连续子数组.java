import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=581 lang=java
 *
 * [581] 最短无序连续子数组
 */
class Solution {

    public int findUnsortedSubarray(int[] nums) {
        // 深拷贝
        int[] tmp = nums.clone();
        Arrays.sort(tmp);
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        while (low < n && nums[low] == tmp[low]) {
            low++;
        }
        // 注意是大于等于low
        while (high >= low && nums[high] == tmp[high]) {
            high--;
        }
        return high - low + 1;
     
    }
}
