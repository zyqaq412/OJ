package 链表.交换链表结点;

import 链表.ListNode;

/**
 * @title: no_24_两两交换链表中的结点
 * @Author zxwyhzy
 * @Date: 2023/9/18 22:57
 * @Version 1.0
 * <p>
 * 给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）。
 */
public class no_24_两两交换链表中的结点 {
    public ListNode swapPairs(ListNode head) {
        // 虚拟头结点
        ListNode nohead = new ListNode();
        nohead.next = head;
        ListNode cur = nohead;
        ListNode firstNode;
        ListNode secondNode;
        ListNode temp;

        while (cur.next != null && cur.next.next != null) {
            // 先给temp赋值 后面交换了就找不到了
            temp = cur.next.next.next;
            firstNode = cur.next;
            secondNode = cur.next.next;

            cur.next = secondNode;
            secondNode.next = firstNode;
            firstNode.next = temp;

            cur = cur.next.next;


        }

        return nohead.next;
    }
}
