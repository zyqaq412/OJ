package 链表.链表高精度加法;

/**
 * @title: no_2
 * @Author zxwyhzy
 * @Date: 2022/10/20 18:53
 * @Version 1.0
 * 第二题：两数相加
 */
public class no_2 {

    class ListNode {
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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0);//定义一个新链表头节点(定位用，不是计算结果的真正头节点)
        ListNode cur = pre;//定义一个可移动指针
        int lemp = 0;//存放进位数
        while (l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;//如果节点为空就返回0，否则就返回节点值
            int y = l2 == null ? 0 : l2.val;
            int sum = x + y + lemp;
            lemp = sum / 10;//获取两数之和的十位，不大于10就是0
            sum = sum % 10;
            cur.next = new ListNode(sum);//将结果添加到新链表
            cur = cur.next;//指向下一个节点
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }

        }
        if(lemp==1){
            cur.next = new ListNode(1);
        }
        return pre.next;//
    }
}

