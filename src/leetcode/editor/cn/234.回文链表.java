/*
 * @lc app=leetcode.cn id=234 lang=java
 *
 * [234] 回文链表
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {

    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null)
            return true;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode reverseNode=reverseList(slow);
        while(head!=null&&reverseNode!=null){
            if(head.val!=reverseNode.val){
                return false;
            }
            head=head.next;
            reverseNode=reverseNode.next;
        }
        return true;
    }
    ListNode reverseList(ListNode head){
        if(head==null)
            return head;
        ListNode pre=head;
        ListNode cur=head.next;
        ListNode temp=null;
        while(cur!=null){
            temp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=temp;
        }
        head.next=null;
        return pre;
    }
}

