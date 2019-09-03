import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=575 lang=java
 *
 * [575] 分糖果
 */
class Solution {
    public int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<>();
        for (int type : candies) {
            set.add(type);
        }
        return set.size()<(candies.length/2)?set.size():candies.length/2;
    }
}

