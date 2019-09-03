import java.util.LinkedList;
import java.util.List;


/*
 * @lc app=leetcode.cn id=589 lang=java
 *
 * [589] N叉树的前序遍历
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
    public List<Integer> preorder(Node root) {
        order(root);
        return result;
    }
    public void order(Node root){
        if(root == null){
            return;
        }
        result.add(root.val);
        if(root.children.size() != 0){
            for (Node child : root.children ) {
                order(child);
            }
        }
    }
}

