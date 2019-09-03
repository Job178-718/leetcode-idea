/*
 * @lc app=leetcode.cn id=119 lang=java
 *
 * [119] 杨辉三角 II
 */
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
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
        return result.get(result.size() - 1);
    }
}
