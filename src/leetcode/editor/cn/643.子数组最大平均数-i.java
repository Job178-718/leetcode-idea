import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/*
 * @lc app=leetcode.cn id=643 lang=java
 *
 * [643] 子数组最大平均数 I
 */
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double temp = sum;
        for (int i = k; i < nums.length; i++) {
            temp += nums[i] -nums[i-k];
            sum = temp>sum?temp:sum;
        }
        return sum/k;
    }
}

