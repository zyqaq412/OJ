package 链表.环形链表;

/**
 * @title: no_141_环形链表
 * @Author zxwyhzy
 * @Date: 2023/2/22 21:11
 * @Version 1.0
 */
public class no_141_环形链表 {
    public boolean hasCycle(ListNode head) {

        // 链表没有结点或者只有一个结点说明没有环
        if (head == null || head.next==null) return false;

        ListNode k = head.next;
        ListNode m = head;
        while (m!=k){
            if (k == null || k.next == null)return false;
            // 快指针一次两步 慢指针一次一步
            k = k.next.next;
            m = m.next;
        }
        return true;
    }
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
