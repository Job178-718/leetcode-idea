/*
 * @lc app=leetcode.cn id=427 lang=java
 *
 * [427] Construct Quad Tree
 */
/*
// Definition for a QuadTree node.
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    public Node() {}

    public Node(boolean _val,boolean _isLeaf,Node _topLeft,Node _topRight,Node _bottomLeft,Node _bottomRight) {
        val = _val;
        isLeaf = _isLeaf;
        topLeft = _topLeft;
        topRight = _topRight;
        bottomLeft = _bottomLeft;
        bottomRight = _bottomRight;
    }
};
*/
class Solution {
    public Node construct(int[][] grid) {
        return helper(grid, 0, 0, grid.length - 1, grid.length - 1);
    }
    
    private Node helper(int[][] grid, int sx, int sy, int es, int ey) {
        if (sx == es && sy == ey) {
            return new Node(grid[es][ey] == 1, true, null, null, null, null);
        }
        int midx = sx + (es - sx) / 2, midy = sy + (ey - sy) / 2;
        Node topLeft = helper(grid, sx, sy, midx, midy);
        Node topRight = helper(grid, sx, midy + 1, midx, ey);
        Node bottomLeft = helper(grid, midx + 1, sy, es, midy);
        Node bottomRight = helper(grid, midx + 1, midy + 1, es, ey);
        if (topLeft.isLeaf && topRight.isLeaf && bottomLeft.isLeaf && bottomRight.isLeaf) {
            if (topLeft.val == topRight.val && topRight.val == bottomLeft.val && bottomLeft.val == bottomRight.val) {
                return new Node(topLeft.val, true, null, null, null, null);
            }
        } 
        return new Node(true, false, topLeft, topRight, bottomLeft, bottomRight);
    }  
}

