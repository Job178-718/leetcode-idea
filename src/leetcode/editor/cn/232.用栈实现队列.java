import java.util.Stack;

/*
 * @lc app=leetcode.cn id=232 lang=java
 *
 * [232] 用栈实现队列
 */

class MyQueue {
    Stack<Integer> stack;
    Stack<Integer> restack;
    /** Initialize your data structure here. */
    public MyQueue() {
        stack = new Stack<>();
        restack = new Stack<>();  
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        this.stack.push(x);
        Stack<Integer> newstack = new Stack<>();
        Stack<Integer> copystack = (Stack)this.stack.clone();
        while(!copystack.isEmpty()){
            newstack.push(copystack.pop());
        }
        this.restack = newstack;
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        int result = this.restack.pop();
        Stack<Integer> newstack = new Stack<>();
        Stack<Integer> copystack = (Stack)this.restack.clone();
        while(!copystack.isEmpty()){
            newstack.push(copystack.pop());
        }
        this.stack = newstack;

        return result;
    }
    
    /** Get the front element. */
    public int peek() {
        return this.restack.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return this.restack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

