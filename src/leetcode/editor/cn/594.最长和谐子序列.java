import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=594 lang=java
 *
 * [594] 最长和谐子序列
 */
class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int res = 0, sum = 0;
        for (int key : map.keySet()) {
            if (map.containsKey(key + 1)) {
                sum = map.get(key) + map.get(key + 1);
                res = Math.max(res, sum);
            }
        }
        return res;
    }
}
