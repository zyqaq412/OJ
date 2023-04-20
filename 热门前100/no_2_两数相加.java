public class no_2_两数相加{
/* 
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。

请你将两个数相加，并以相同形式返回一个表示和的链表。

你可以假设除了数字 0 之外，这两个数都不会以 0 开头。

来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/add-two-numbers
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * 
 * 
 */

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode ln = new ListNode();
            // 第一次 进位为0
            add(l1, l2,0,ln);
            return ln.next;

        }
        /**
         *
         * @param l1 加数
         * @param l2 加数
         * @param n  进位
         * @param ln 和
         */

        public void add(ListNode l1, ListNode l2,int n,ListNode ln){
            // 两个链表都空 结束递归
            if(l1 == null && l2 == null) {
                // 结束前判断上一次相加有没有进位  有就加上
                if(n>0) ln.next = new ListNode(n);
                return;
            }
            // 如果有一个链表空了就补零
            int n1 = l1==null?0:l1.val;
            int n2 = l2==null?0:l2.val;
            ln.next = new ListNode(n1+n2+n);
            n = 0;
            // 判断是否产生进位
            if(ln.next.val>=10){
                n = ln.next.val/10;
                ln.next.val %= 10;

            }
            // 防止空指针异常
            add(l1 == null? null:l1.next,
                    l2 == null? null:l2.next,
                    n,ln.next);
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
