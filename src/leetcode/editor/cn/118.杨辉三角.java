import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode.cn id=118 lang=java
 *
 * [118] 杨辉三角
 */
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> r = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (i == 0 || j == 0 || j == i) {
                    r.add(1);
                } else {
                    List<Integer> n = new ArrayList<>();
                    n = result.get(i - 1);
                    r.add(n.get(j - 1) + n.get(j));
                }
            }
            result.add(r);
        }
        return result;
    }
}
