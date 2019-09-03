/*
 * @lc app=leetcode.cn id=21 lang=java
 *
 * [21] 合并两个有序链表
 *
 * https://leetcode-cn.com/problems/merge-two-sorted-lists/description/
 *
 * algorithms
 * Easy (53.85%)
 * Total Accepted:    61.1K
 * Total Submissions: 113.4K
 * Testcase Example:  '[1,2,4]\n[1,3,4]'
 *
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 * 
 * 示例：
 * 
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 * 
 * 
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode r = l3;
        ListNode q = l1;
        ListNode p = l2;
        while (p != null && q != null) {
            if (p.val <= q.val) {
                r.next = new ListNode(p.val);
                r = r.next;
                p = p.next;
            } else {
                r.next = new ListNode(q.val);
                r = r.next;
                q = q.next;
            }
        }
        if (p == null) {
            r.next = q;
        } else {
            r.next = p;
        }
        return l3.next;
    }
}

