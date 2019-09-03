/*
 * @lc app=leetcode.cn id=496 lang=java
 *
 * [496] 下一个更大元素 I
 */
class Solution {
public int[] nextGreaterElement(int[] num1, int[] nums2) {
        //辅助栈，存放待查找结果的元素，查找到的立即出栈
        Stack<Integer> stack = new Stack<>();
        //key存放元素，value存放找到的第一个大于它的值
        Map<Integer, Integer> map = new HashMap<>();
        //当栈顶元素大于当前元素时，入栈；当栈顶元素小于当前元素时，说明栈顶元素找到了第一个大于的值，出栈，然后继续出栈直到栈顶元素大于当前元素，将当前元素入栈。
        for (int i = 0; i < nums2.length; i++) {
            while(!stack.isEmpty() && stack.peek() < nums2[i]){
                map.put(stack.pop(), nums2[i]);
            }
            stack.push(nums2[i]);
        }
        //ans数组存放结果
        int[] ans = new int[num1.length];
        //遍历num1，在map中查找结果，不存在说明没有大于它的第一个元素，赋值为-1
        for (int i = 0; i < num1.length; i++) {
            ans[i] = map.getOrDefault(num1[i], -1);
        }
        return ans;
    }
}
