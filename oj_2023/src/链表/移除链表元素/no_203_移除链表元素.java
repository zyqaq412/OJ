package 链表.移除链表元素;

import 链表.ListNode;

/**
 * @title: no_203_移除链表元素
 * @Author zxwyhzy
 * @Date: 2023/9/18 18:09
 * @Version 1.0
 *
 * 给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
 */
public class no_203_移除链表元素 {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return head;
        }

        ListNode temp = head;

        // 因为是单链表 需要前一个结点才能删除当前结点
        while(temp !=null && temp.next != null){
            if(temp.next.val == val){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }

        }
        // 最后判断头节点是否相等
        return head.val == val ? head.next : head;
    }

}
