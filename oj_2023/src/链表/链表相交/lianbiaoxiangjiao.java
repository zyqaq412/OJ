package 链表.链表相交;

import 链表.ListNode;

/**
 * @title: lianbiaoxiangjiao
 * @Author zxwyhzy
 * @Date: 2023/9/19 20:43
 * @Version 1.0
 * 给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。如果两个链表没有交点，返回 null 。
 * https://leetcode.cn/problems/intersection-of-two-linked-lists-lcci/description/
 */
public class lianbiaoxiangjiao {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ta = headA;
        ListNode tb = headB;

        while (ta != tb) {
            ta = (ta == null) ? headB : ta.next;
            tb = (tb == null) ? headA : tb.next;
        }

        return ta;
    }
    // 这个慢很多
    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        ListNode ta = headA;
        ListNode tb = headB;

        while (ta != tb) {
            ta = (ta == null) ? headA : ta.next;
            tb = (tb == null) ? headB : tb.next;
        }

        return ta;
    }
/*    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ta = headA;
        ListNode tb = headB;

        while (ta != tb) {
        // 这个条件会导致不相交时死循环
            ta = (ta.next == null) ? headB : ta.next;
            tb = (tb.next == null) ? headA : tb.next;
        }

        return ta;
    }*/
}
