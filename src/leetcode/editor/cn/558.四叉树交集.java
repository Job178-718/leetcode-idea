/*
 * @lc app=leetcode.cn id=558 lang=java
 *
 * [558] 四叉树交集
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
    public Node intersect(Node quadTree1, Node quadTree2) {
        if(quadTree1.isLeaf && quadTree2.isLeaf){
            Node res = new Node(false, false, null, null, null, null);
            res.val = quadTree1.val || quadTree2.val;
            res.isLeaf = true;
            return res;
        }
        else if(quadTree1.isLeaf && !quadTree2.isLeaf){
            if(quadTree1.val){
                return quadTree1;
            }
            else{
                return quadTree2;
            }
        }
        else if(quadTree2.isLeaf && !quadTree1.isLeaf){
            if(quadTree2.val){
                return quadTree2;
            }
            else{
                return quadTree1;
            }
        }
        else{
            Node res = new Node(false, false, null, null, null, null);
            res.topLeft = intersect(quadTree1.topLeft, quadTree2.topLeft);
            res.topRight = intersect(quadTree1.topRight, quadTree2.topRight);
            res.bottomLeft = intersect(quadTree1.bottomLeft, quadTree2.bottomLeft);
            res.bottomRight = intersect(quadTree1.bottomRight, quadTree2.bottomRight);
            //合并
            if(res.topLeft.isLeaf && res.topRight.isLeaf
               && res.bottomLeft.isLeaf && res.bottomRight.isLeaf
               && res.topLeft.val == res.topRight.val
               && res.topRight.val == res.bottomLeft.val
               && res.bottomLeft.val == res.bottomRight.val){
                res = res.topLeft;
            }
            return res;
        }
    }
}

