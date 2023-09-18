package 链表.翻转链表;

import 链表.ListNode;

/**
 * @title: no_206_反转链表 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 * @Author zxwyhzy
 * @Date: 2023/9/18 21:28
 * @Version 1.0
 */
public class no_206_反转链表 {
    // 双指针
    public ListNode reverseList2(ListNode head) {
        ListNode prev = null;
        ListNode next = head;
        while(next != null ){
            ListNode temp = next.next;
            next.next = prev;
            prev = next;
            next = temp;
        }
        return prev;
    }
    // 递归
    public ListNode reverseList(ListNode head) {
        // head.next == null 判断是否递归到最后一个结点
        // head == null 链表可能为空
        if (head == null || head.next == null ){
            return head;
        }
        // temp 是原本最后一个结点
        ListNode temp = reverseList(head.next);
        // head 是当前结点
        head.next.next = head;
        head.next = null;

        return temp;
    }
}
