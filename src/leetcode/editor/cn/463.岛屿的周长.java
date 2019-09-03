/*
 * @lc app=leetcode.cn id=463 lang=java
 *
 * [463] 岛屿的周长
 */
class Solution {
	public int islandPerimeter(int[][] grid) {
		if (grid == null || grid.length == 0)
			return 0;
		// 二维数组1的个数
		int numOf1 = 0;
		// 重复边的个数
		int repeat = 0;
		for (int i = 0; i < grid.length; i++)
			for (int j = 0; j < grid[0].length; j++)
				if (grid[i][j] == 1) {
					numOf1++;
					// 上下左右是否为1
					if (i - 1 >= 0 && grid[i - 1][j] == 1)
						repeat++;
					if (i + 1 < grid.length && grid[i + 1][j] == 1)
						repeat++;
					if (j - 1 >= 0 && grid[i][j - 1] == 1)
						repeat++;
					if (j + 1 < grid[0].length && grid[i][j + 1] == 1)
						repeat++;
 
				}
		return numOf1 * 4 - repeat;
	}
}

