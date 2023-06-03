/**
 * @title: no_23_合并K个升序链表
 * @Author zxwyhzy
 * @Date: 2023/6/3 9:39
 * @Version 1.0
 */
public class no_23_合并K个升序链表 {

    class Solution {

        /*        public ListNode mergeKLists(ListNode[] lists) {
                    ListNode node = lists[0];
                    for (int i = 0; i < lists.length-1; i++) {
                        while (node.next!=null){
                            node = node.next;
                        }
                        node.next = lists[i+1];
                        node = node.next;
                    }
                    marge(lists[0]);
                    return null;
                }
                public void marge(ListNode node){

                }*/
/*        public ListNode mergeKLists(ListNode[] lists) {
            if (lists.length == 0) {
                return null;
            }
            if (lists.length == 1) {
                return lists[0];
            }
            ListNode node = null;
            for (int i = 0; i < lists.length - 1; i++) {
                if (node == null) {
                    node = mergeTwoLists(lists[i], lists[i + 1]);
                } else {
                    node = mergeTwoLists(node, lists[i + 1]);
                }

            }
            return node;
        }*/
        // 优化
        public ListNode mergeKLists(ListNode[] lists) {

            ListNode node = null;
            for (int i = 0; i < lists.length; i++) {
                node = mergeTwoLists(node,lists[i]);
            }
            return node;
        }
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if (l1 == null) {
                return l2;
            } else if (l2 == null) {
                return l1;
            }
            ListNode ans = new ListNode();
            ListNode ts = ans;


            while (l1 != null && l2 != null) {
                if (l1.val <= l2.val) {
                    ts.next = l1;
                    ts = ts.next;
                    l1 = l1.next;
                } else {
                    ts.next = l2;
                    ts = ts.next;
                    l2 = l2.next;
                }
            }
            if (l1 == null) {
                ts.next = l2;
                return ans.next;
            } else if (l2 == null) {
                ts.next = l1;
                return ans.next;
            }

            return ans.next;
        }
    }


    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
