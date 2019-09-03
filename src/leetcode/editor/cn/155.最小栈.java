import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=155 lang=java
 *
 * [155] 最小栈
 */
class MinStack {
    private LinkedList<Integer> stack;
    List<Integer> array;
    int min;
    public MinStack() {
        stack = new LinkedList<>();
        array = new ArrayList<>();
        min = Integer.MAX_VALUE;
    }
    public void push(int x) {
        stack.push(x);
        array.add(x);
        min = Math.min(min, x);
    }
    public void pop() {
        int num = stack.pop();
        array.remove(array.size() - 1);
        if(array.size() > 0) {
            min = array.get(0);
            for (int i = 0; i < array.size(); i++) {
                if(min > array.get(i)) {
                    min = array.get(i);
                }
            }
        }else {
            min = Integer.MAX_VALUE;
        }
    }
    public int top() {
        return stack.peek();
    }
    public int getMin() {
        return min;
    }
}
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

