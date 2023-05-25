/**
 * @title: no_234_回文链表
 * @Author zxwyhzy
 * @Date: 2023/5/25 19:47
 * @Version 1.0
 */
public class no_234_回文链表 {
    class Solution {
        public boolean isPalindrome(ListNode head) {
            StringBuffer str1 = new StringBuffer();
            StringBuffer str2 = new StringBuffer();
            process(str1, str2, head);
            return str1.toString().contentEquals(str2);
        }

        public void process(StringBuffer str1, StringBuffer str2, ListNode node) {
            if (node == null)
                return;
            str1.append(node.val);
            process(str1,str2,node.next);
            str2.append(node.val);
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