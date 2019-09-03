import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=645 lang=java
 *
 * [645] 错误的集合
 */
class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int[] result = new int[2];
        // 先寻找到重复出现的整数
        for (int num : nums) {
            if (!set.add(num)) {
                result[0] = num;
            }
        }
        // 再找到丢失的整数
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                result[1] = i;
            }
        }
        return result;
    }
}

