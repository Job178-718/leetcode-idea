/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 *
 * https://leetcode-cn.com/problems/valid-parentheses/description/
 *
 * algorithms
 * Easy (37.35%)
 * Total Accepted:    65.2K
 * Total Submissions: 174.3K
 * Testcase Example:  '"()"'
 *
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * 
 * 有效字符串需满足：
 * 
 * 
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 
 * 
 * 注意空字符串可被认为是有效字符串。
 * 
 * 示例 1:
 * 
 * 输入: "()"
 * 输出: true
 * 
 * 
 * 示例 2:
 * 
 * 输入: "()[]{}"
 * 输出: true
 * 
 * 
 * 示例 3:
 * 
 * 输入: "(]"
 * 输出: false
 * 
 * 
 * 示例 4:
 * 
 * 输入: "([)]"
 * 输出: false
 * 
 * 
 * 示例 5:
 * 
 * 输入: "{[]}"
 * 输出: true
 * 
 */
import java.util.Stack;
import java.util.HashMap;
class Solution {
    public boolean isValid(String s) {
        if(s==null||s.length()==0) return true;
        Stack<Character> stack = new Stack<>();
        HashMap<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        for(int i = 0;i<s.length();i++){
            if(map.containsValue(s.charAt(i))){
                stack.push(s.charAt(i));
            }else{
                try {
                    char value = stack.pop();
                    if(map.get(s.charAt(i))!=value){
                        return false;
                    }
                } catch (Exception e) {
                    //TODO: handle exception
                    return false;
                }
            }

        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
//     public static void main(String[] args) {
//         Solution solution = new Solution();
//         System.out.println(solution.isValid("{[(])}"));
//     }
}

