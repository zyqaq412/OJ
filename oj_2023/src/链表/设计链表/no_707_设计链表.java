package 链表.设计链表;

/**
 * @title: no_707_设计链表
 * @Author zxwyhzy
 * @Date: 2023/9/18 18:14
 * @Version 1.0
 */
public class no_707_设计链表 {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(1,2);
        myLinkedList.get(0);
        myLinkedList.deleteAtIndex(0);
        myLinkedList.get(0);
    }
 static     class MyLinkedList {

        int size;
        ListNode head;


        public MyLinkedList() {
            this.size = 0;
            this.head = null;
        }

        /**
         * 获取链表中下标为 index 的节点的值。如果下标无效，则返回 -1
         *
         * @param index 下标
         * @return
         */
        public int get(int index) {
            if (index < 0 || index >= size) return -1;
            ListNode temp = head;

            while (index > 0) {
                temp = temp.next;
                index--;
            }

            return temp.val;
        }

        //  将一个值为 val 的节点插入到链表中第一个元素之前。在插入完成后，新节点会成为链表的第一个节点。
        public void addAtHead(int val) {
            size++;
            if (head == null) {
                head = new ListNode(val);
                return;
            }
            ListNode listNode = new ListNode(null, head, val);
            head.prev = listNode;
            head = listNode;
        }

        // 将一个值为 val 的节点追加到链表中作为链表的最后一个元素。
        public void addAtTail(int val) {
            size++;
            if (size == 1){
                head = new ListNode(val);
                return;
            }

            ListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            ListNode listNode = new ListNode(temp, null, val);
            temp.next = listNode;
        }

        // 将一个值为 val 的节点插入到链表中下标为 index 的节点之前。
        // 如果 index 等于链表的长度，那么该节点会被追加到链表的末尾。
        // 如果 index 比长度更大，该节点将 不会插入 到链表中。
        public void addAtIndex(int index, int val) {
            if (index > size || index < 0) return;
            if (index == size) {
                addAtTail(val);
                return;
            }
            if (index == 0) {
                addAtHead(val);
                return;
            }
            size++;
            ListNode temp = head;
            while (index != 0) {
                temp = temp.next;
                index--;
            }
            ListNode listNode = new ListNode(temp.prev, temp, val);
            temp.prev.next = listNode;
            temp.prev = listNode;
        }

        // 如果下标有效，则删除链表中下标为 index 的节点。
        public void deleteAtIndex(int index) {
            if (index < 0 || index >= size || size == 0) return;
            size--;
            if (size == 0) {
                head = null;
                return;
            }
            if (index == 0){
                head = head.next;
                return;
            }
            ListNode temp = head;
            while (index != 0) {
                temp = temp.next;
                index--;
            }

            if (temp.prev != null) temp.prev.next = temp.next;
            if (temp.next != null) temp.next.prev = temp.prev;


        }

        class ListNode {
            ListNode prev;
            ListNode next;

            int val;

            public ListNode() {

            }

            public ListNode(int val) {
                this.val = val;
            }

            public ListNode(ListNode prev, ListNode next, int val) {
                this.prev = prev;
                this.next = next;
                this.val = val;
            }
        }
    }
}
