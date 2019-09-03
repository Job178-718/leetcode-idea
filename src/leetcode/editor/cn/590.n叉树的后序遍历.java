import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=590 lang=java
 *
 * [590] N叉树的后序遍历
 */
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    List<Integer> result = new LinkedList<>();
    public List<Integer> postorder(Node root) {
        order(root);
        return result;
    }
    public void order(Node root){
        if(root == null){
            return;
        }
        if(root.children.size() != 0){
            for (Node child : root.children ) {
                order(child);
            }
        }
        result.add(root.val);
    }
}

