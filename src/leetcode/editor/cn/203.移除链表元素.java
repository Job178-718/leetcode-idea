/*
 * @lc app=leetcode.cn id=203 lang=java
 *
 * [203] 移除链表元素
 */
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return head;
        }
        if (head.val == val) {
            head = head.next;
            return removeElements(head, val);
        } else {
            ListNode q = head;
            ListNode p = q.next;
            while (p != null) {
                if (p.val == val) {
                    q.next = p.next;
                    p = p.next;
                } else {
                    q = p;
                    p = p.next;
                }
            }
            return head;
        }

    }
}
