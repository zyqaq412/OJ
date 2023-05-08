import java.util.HashSet;

/**
 * @title: no_160_相交链表
 * @Author zxwyhzy
 * @Date: 2023/5/8 13:18
 * @Version 1.0
 */
public class no_160_相交链表 {
    public class Solution {



        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

            var set = new HashSet<ListNode>();

            while (headA !=null){
                set.add(headA);
                headA = headA.next;
            }
            while (headB != null){
                if (set.add(headB)){
                    headB = headB.next;
                }else {
                    return headB;
                }
            }
            return null;
        }

        public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {

            var set = new HashSet<ListNode>();

            while (headA !=null){
                set.add(headA);
                headA = headA.next;
            }
            while (headB != null){
                if (set.add(headB)){
                    headB = headB.next;
                }else {
                    return headB;
                }
            }
            return null;
        }

        public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
            ListNode pA = headA, pB = headB;
            while (pA != pB) {
                pA = pA == null ? headB : pA.next;
                pB = pB == null ? headA : pB.next;
            }
            return pA;
        }

}


    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

}
