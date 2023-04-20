/**
 * @title: no_19_删除链表的倒数第N个结点
 * @Author zxwyhzy
 * @Date: 2023/4/20 23:05
 * @Version 1.0
 */
public class no_19_删除链表的倒数第N个结点 {


      class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            if(head.next == null) return null;
            int count = 0;
            ListNode temp =head;
            while (temp != null){
                count++;
                temp = temp.next;
            }
            // 一个5个倒数第2个就是正数第4个
            int g = count - n + 1;
            // 如果删的是第一个 直接返回头节点的下一个
            if(g==1) return head.next;
            temp = head;
            // 单向链表 删除要找被删除链表前一个结点
            while (g>2){
                temp = temp.next;
                g--;
            }
            temp.next = temp.next.next;
            return head;
        }
        public ListNode removeNthFromEnd2(ListNode head, int n) {
            ListNode dummy = new ListNode(0, head);

            // first比second超前n个节点。
            // 当first遍历到链表的末尾时second就恰好处于倒数第n个节点。
            ListNode first = head;
            ListNode second = dummy;
            for (int i = 0; i < n; ++i) {
                first = first.next;
            }
            while (first != null) {
                first = first.next;
                second = second.next;
            }
            second.next = second.next.next;
            ListNode ans = dummy.next;
            return ans;
        }
    }
}
