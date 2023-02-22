package 链表;

import 链表.链表的合并.no_21;

/**
 * @title: no_707_设计链表
 * @Author zxwyhzy
 * @Date: 2023/2/22 19:11
 * @Version 1.0
 * 设计链表的实现。您可以选择使用单链表或双链表。单链表中的节点应该具有两个属性：val 和 next。val 是当前节点的值，next 是指向下一个节点的指针/引用。如果要使用双向链表，则还需要一个属性 prev 以指示链表中的上一个节点。假设链表中的所有节点都是 0-index 的。
 *
 * 在链表类中实现这些功能：
 *
 * get(index)：获取链表中第 index 个节点的值。如果索引无效，则返回-1。
 * addAtHead(val)：在链表的第一个元素之前添加一个值为 val 的节点。插入后，新节点将成为链表的第一个节点。
 * addAtTail(val)：将值为 val 的节点追加到链表的最后一个元素。
 * addAtIndex(index,val)：在链表中的第 index 个节点之前添加值为 val  的节点。如果 index 等于链表的长度，则该节点将附加到链表的末尾。如果 index 大于链表长度，则不会插入节点。如果index小于0，则在头部插入节点。
 * deleteAtIndex(index)：如果索引 index 有效，则删除链表中的第 index 个节点。
 */
public class no_707_设计链表 {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtHead(2);
        linkedList.deleteAtIndex(1);
        linkedList.addAtHead(2);
        linkedList.addAtHead(7);
        linkedList.addAtHead(3);
        linkedList.addAtHead(2);
        linkedList.addAtHead(5);
        linkedList.addAtTail(5);
        System.out.println(linkedList.get(5));
        linkedList.deleteAtIndex(6);
        linkedList.deleteAtIndex(4);

    }

}
class MyLinkedList {
    int size;
    ListNode head;

    public MyLinkedList() {
        this.size = 0;
        this.head = null;
    }

    /**
     * get(index)：获取链表中第 index 个节点的值。如果索引无效，则返回-1。
     * @param index
     * @return
     */
    public int get(int index) {
        if(this.head == null) return -1;
        if (index<0||index+1>size) return -1;
        //if (index==1) return this.head.val;
        if (index==0) return this.head.val;
        ListNode temp = head;
        //while (index >1){
        while (index >0){
            temp = temp.next;
            index--;
        }
        return temp.val;
    }

    /**
     * addAtHead(val)：
     * 在链表的第一个元素之前添加一个值为 val 的节点。插入后，新节点将成为链表的第一个节点。
     * @param val
     */
    public void addAtHead(int val) {
        if (this.head == null){
            this.head = new ListNode(val);
            this.size++;
        }else {
            ListNode temp = new ListNode(val);
            temp.next = this.head;
            temp.pre = null;
            this.head.pre = temp;
            this.head = temp;
            this.size++;
        }

    }

    /**
     * addAtTail(val)：将值为 val 的节点追加到链表的最后一个元素。
     * @param val
     */
    public void addAtTail(int val) {
        if (this.head==null) {
            this.head = new ListNode(val);
            this.size++;
            return;
        }
        ListNode temp = this.head;
        while (true){
            if (temp.next == null) {
                temp.next = new ListNode(val);
                temp.next.pre = temp;
                this.size++;
                return;
            }else {
                temp = temp.next;
            }
        }
    }

    /**
     * addAtIndex(index,val)：
     * 在链表中的第index个节点之前添加值为val 的节点。
     * 如果index等于链表的长度，则该节点将附加到链表的末尾。
     * 如果 index 大于链表长度，则不会插入节点。如果index小于0，则在头部插入节点。
     *
     * @param index
     * @param val
     */
    public void addAtIndex(int index, int val) {
        if (index > this.size) return;
        else if (index <= 0) addAtHead(val);
        else if (index == this.size) addAtTail(val);
        else {
            ListNode temp = this.head;
            while (index>0){
                temp = temp.next;
                index--;
            }
            ListNode listNode = new ListNode(val);
            temp.pre.next = listNode;
            listNode.pre = temp.pre;
            temp.pre = listNode;
            listNode.next = temp;
            this.size++;

        }
    }

    /**
     * deleteAtIndex(index)：如果索引 index 有效，则删除链表中的第 index 个节点。
     * @param index
     */
    public void deleteAtIndex(int index) {
        if (this.head == null) return;
        //if (index <= 0 || index > this.size) return;
        if (index < 0 || index+1 > this.size) return;
        if (index == 0){
            if (this.size == 1) this.head=null;
            else {
                this.head = this.head.next;
                this.head.pre.next = null;
                this.head.pre = null;
                this.size--;
            }
        }else {
            ListNode temp = head;
            //while (index>1){
            while (index>0){
                temp = temp.next;
                index--;
            }
            temp.pre.next = temp.next;
            if (temp.next != null){
                temp.next.pre = temp.pre;
            }
            this.size--;
        }
    }
    class ListNode{
        int val;

        ListNode pre;
        ListNode next;

        public ListNode(int val){
            this.val = val;
        }
    }
}
