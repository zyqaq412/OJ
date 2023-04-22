/**
 * @title: no_21_合并两个有序链表
 * @Author zxwyhzy
 * @Date: 2023/4/22 20:00
 * @Version 1.0
 */
public class no_21_合并两个有序链表 {
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  class Solution {

        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if (l1 == null) {
                return l2;
            }
            else if (l2 == null) {
                return l1;
            }
            // 我们判断 l1 和 l2 头结点哪个更小，然后较小结点的 next 指针指向其余结点的合并结果。
            else if (l1.val < l2.val) {
                l1.next = mergeTwoLists(l1.next, l2);
                return l1;
            }
            else {
                l2.next = mergeTwoLists(l1, l2.next);
                return l2;
            }

        }
        public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
            if (l1 == null) {
                return l2;
            }
            else if (l2 == null) {
                return l1;
            }
            ListNode ans = new ListNode();
            ListNode ts = ans;


            while (l1!=null && l2!=null) {
                if (l1.val <= l2.val){
                    ts.next = l1;
                    ts = ts.next;
                    l1 = l1.next;
                }else {
                    ts.next = l2;
                    ts = ts.next;
                    l2 = l2.next;
                }
            }
            if (l1 == null) {
                ts.next = l2;
                return ans.next;
            }
            else if (l2 == null) {
                ts.next = l1;
                return ans.next;
            }

            return ans.next;
        }
    }
}
