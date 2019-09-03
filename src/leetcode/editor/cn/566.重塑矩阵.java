/*
 * @lc app=leetcode.cn id=566 lang=java
 *
 * [566] 重塑矩阵
 */
class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int r_old = nums.length;
        int c_old = nums[0].length;
        if(r_old*c_old != r*c){
            return nums;
        }
        int k =0;
        int [][] result = new int[r][c];
        for (int i = 0; i < r_old; i++) {
            for (int j = 0; j < c_old; j++) {
                int p = k/c;
                int q = k%c;
                result[p][q] = nums[i][j];
                k++;
            }
        }
        return result;
    }
}

