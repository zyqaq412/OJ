public class no_2_两数相加{

}
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ln = new ListNode(); 
        add(l1, l2,0,ln);
        return ln.next;
        
    }
    public void add(ListNode l1, ListNode l2,int n,ListNode ln){
        if(l1 == null && l2 == null) {
            if(n==0) ln.next = new ListNode(n);
            return;
        }
        int n1 = l1==null?0:l1.val;
        int n2 = l2==null?0:l2.val;
        ln.next = new ListNode(n1+n2+n);
        if(ln.next.val>=10){
            ln.next.val %= 10;
            n = 1;
        }
        
        add(l1.next,l2.next,n,ln.next);
    }
}
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }