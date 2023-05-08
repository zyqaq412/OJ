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
        /*
        * 如果两个链表相交，那么它们在相交节点之后的长度应该是相同的，
        * 因此将两个指针分别从headA和headB开始移动，最终它们会在相交节点处相遇。
        * 如果两个链表不相交，那么它们在结束时会同时到达链表的末尾，此时pA和pB均为null
        * */
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
