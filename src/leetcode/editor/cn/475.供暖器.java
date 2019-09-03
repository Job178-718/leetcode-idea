/*
 * @lc app=leetcode.cn id=475 lang=java
 *
 * [475] 供暖器
 */
public class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int res = 0;
        for (int house: houses) {
            int i = 0;
            while (i < heaters.length - 1 && heaters[i] + heaters[i + 1] < house * 2) {
                i++;
            }
            res = Math.max(res, Math.abs(heaters[i] - house));
        }
        return res;
    }
}

