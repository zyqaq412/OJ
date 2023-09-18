package 链表.设计链表;

/**
 * @title: MyLinkedList 707 优化
 * @Author zxwyhzy
 * @Date: 2023/9/18 20:56
 * @Version 1.0
 */
public class MyLinkedList {

    int size;
    ListNode head;
    ListNode tail;


    public MyLinkedList() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    /**
     * 获取链表中下标为 index 的节点的值。如果下标无效，则返回 -1
     *
     * @param index 下标
     * @return
     */
    public int get(int index) {
        if (index < 0 || index >= size) return -1;
        ListNode temp;
        if (index > (size - index)) {
            // 从后往前找
            temp = tail;
            index = size - index - 1;

            while (index > 0) {
                temp = temp.prev;
                index--;
            }

        } else {
            temp = head;
            while (index > 0) {
                temp = temp.next;
                index--;
            }
        }
        return temp.val;

    }

    //  将一个值为 val 的节点插入到链表中第一个元素之前。在插入完成后，新节点会成为链表的第一个节点。
    public void addAtHead(int val) {
        ListNode node = new ListNode(val);
        if (size == 0) {
            // 空链表
            head = node;
            tail = node;

        } else {
            node.next = head;
            head.prev = node;

            head = node;
        }
        size++;

    }

    // 将一个值为 val 的节点追加到链表中作为链表的最后一个元素。
    public void addAtTail(int val) {
        if (size == 0) {
            addAtHead(val);
            return;
        }
        ListNode node = new ListNode(val);

        tail.next = node;
        node.prev = tail;
        tail = node;
        size++;
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
        ListNode node = new ListNode(val);
        ListNode temp;
        if (index > (size - index)) {
            // 从后往前找
            temp = tail;
            index = size - index - 1;

            while (index > 0) {
                temp = temp.prev;
                index--;
            }
            temp.prev.next = node;
            node.prev = temp.prev;
            node.next = temp;
            temp.prev = node;

        } else {
            temp = head;
            while (index > 0) {
                temp = temp.next;
                index--;
            }
            temp.prev.next = node;
            node.prev = temp.prev;
            node.next = temp;
            temp.prev = node;
        }
        size++;

    }

    // 如果下标有效，则删除链表中下标为 index 的节点。
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;

        ListNode temp;

        if (index == 0){
            head = head.next;

        } else if (index == size - 1) {
            tail.prev.next = null;
            tail = tail.prev;
        } else if (index > (size - index)) {
            // 从后往前找
            temp = tail;
            index = size - index - 1;

            while (index > 0) {
                temp = temp.prev;
                index--;
            }
            temp.prev.next = temp.next;
            if (temp.next != null) temp.next.prev = temp.prev;

        } else {
            temp = head;
            while (index > 0) {
                temp = temp.next;
                index--;
            }
            if (temp.prev != null) temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
        size--;

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
