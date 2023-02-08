package 链表.遍历;

/**
 * @title: no_876_链表的中间结点
 * @Author zxwyhzy
 * @Date: 2023/2/8 23:50
 * @Version 1.0
 * 给定一个头结点为 head 的非空单链表，返回链表的中间结点。
 *
 * 如果有两个中间结点，则返回第二个中间结点。
 * 利用快慢指针，快指针每次走两步，慢指针每次走一步，
 * 所以快指针走的距离为慢指针的两倍，故当快指针遍历到链表末尾时，慢指针指向记为中间节点
 */
public class no_876_链表的中间结点 {

        public ListNode middleNode(ListNode head) {
            ListNode m = head;
            ListNode k = head;

            while (true){
                if (m.next == null) return m;
                m = m.next;
                if (k.next.next==null) return m;
                k = k.next.next;
                if (k.next==null) return m;

            }
        }
    class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
}
