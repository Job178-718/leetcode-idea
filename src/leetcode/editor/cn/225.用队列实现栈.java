import java.util.Queue;

/*
 * @lc app=leetcode.cn id=225 lang=java
 * 
 * [225] 用队列实现栈
 */
class MyStack {
    Queue<Integer> queue;
    /** Initialize your data structure here. */
    public MyStack() {
        queue =new LinkedList<Integer>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        queue.add(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        Queue<Integer> newqueue =new LinkedList<Integer>();
        while(this.queue.size()>1){
            newqueue.add(this.queue.poll());
        }
        int result = this.queue.poll();
        this.queue = newqueue;
        return result;
    }
    
    /** Get the top element. */
    public int top() {
        Queue<Integer> newqueue = new LinkedList<Integer>();
        while(this.queue.size()>1){
            newqueue.add(this.queue.poll());
        }
        int result = this.queue.poll();
        newqueue.add(result);
        this.queue = newqueue;
        return result;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return this.queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

