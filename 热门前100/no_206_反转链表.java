import java.util.ArrayList;
import java.util.List;

/**
 * @title: no_206_反转链表
 * @Author zxwyhzy
 * @Date: 2023/5/8 14:22
 * @Version 1.0
 * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 *
 */
public class no_206_反转链表 {
    class Solution {
        public ListNode reverseList(ListNode head) {
            if (head == null) return null;
            List<ListNode> list = new ArrayList<>();
            while (head!=null){
                list.add(head);
                head = head.next;
            }
            int len = list.size();
            for (int i = len-1; i >0; i--) {
                list.get(i).next = list.get(i-1);
            }
            list.get(0).next=null;
            return list.get(len-1);
        }
        public ListNode reverseList2(ListNode head) {
            // prev，用于记录当前节点的前一个节点。初始化为 null
            ListNode prev = null;
            // curr，用于记录当前节点。初始化为链表的头节点
            ListNode curr = head;
            while (curr != null) {
                // next，用于记录当前节点的下一个节点。
                ListNode next = curr.next;
                // 将当前节点的 next 指针指向 prev，完成翻转。
                curr.next = prev;
                // 将 prev 指针移动到当前节点。
                prev = curr;
                // curr 指针移动到下一个节点。
                curr = next;
            }
            return prev;
        }

        public ListNode reverseList3(ListNode head) {
            // 如果链表为空或只有一个节点，则直接返回头节点
            if (head == null || head.next == null) {
                return head;
            }
            // 递归调用 reverseList3() 函数，传入头节点的下一个节点作为参数，返回翻转后的链表头节点
            ListNode newHead = reverseList(head.next);
            // 将头节点的下一个节点的 next 指针指向头节点，实现翻转
            head.next.next = head;
            // 将头节点的 next 指针置为 null，防止出现循环链表
            head.next = null;
            // 返回翻转后的链表头节点
            return newHead;
        }
    }


public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

}
