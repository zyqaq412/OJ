package hzy.T2022.T10_20;

/**
 * @title: no_21
 * @Author zxwyhzy
 * @Date: 2022/10/20 19:06
 * @Version 1.0
 * 第二十四题：合并两个有序链表
 */
public class no_21 {
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        if(list1.val < list2.val){
            list1.next = mergeTwoLists(list1.next,list2);
            return list1;
        }else{
            list2.next = mergeTwoLists(list1,list2.next);
            return list2;
        }

    }
}
