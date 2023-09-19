package 链表.删除链表的倒数第N个结点;

import 链表.ListNode;

/**
 * @title: no_19
 * @Author zxwyhzy
 * @Date: 2023/9/19 19:50
 * @Version 1.0
 * <p>
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 */
public class no_19 {

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        n1.next = n2;
        new no_19().removeNthFromEnd(n1,1);
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (n < 1 || n > 30) return head;

        // 待删除结点前一个 (当temp走到最后且n还大于0时 删除结点是head)
        ListNode cur = head;
        ListNode temp = head;
        while (temp.next != null){
            if (n <= 0){
                cur = cur.next;
            }
            n--;
            temp = temp.next;
        }
        if(n == 1){
            return head.next;
        }

        if (cur == head && temp == head){
            return null;
        }
        cur.next = cur.next.next;
        return head;
    }
}
