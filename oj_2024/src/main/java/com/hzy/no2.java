package com.hzy;

/**
 * @title: no2
 * @Author zxwyhzy
 * @Date: 2024/2/3 12:35
 * @Version 1.0
 */
public class no2 {
/*    给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。

    请你将两个数相加，并以相同形式返回一个表示和的链表。

    你可以假设除了数字 0 之外，这两个数都不会以 0 开头给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。

    你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。

    你可以按任意顺序返回答案。*/


/*    在每一步递归中，计算当前节点的和，将和加入新的节点，并判断是否有进位。如果有进位，则在下一次递归中加上进位。
    使用变量 a 来表示进位。在函数签名中将进位作为参数传递。
    通过判断 l1 和 l2 是否为 null 来处理链表长度不同的情况。
    当 l1 l2 都为空时 需要注意是否有进位需要添加

    时间复杂度：O(max(l1,l2))*/

    class Solution {
        ListNode ans;

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode head = new ListNode(0);
            ans = head;
            process(l1, l2, 0);
            return head.next;
        }

        private void process(ListNode l1, ListNode l2, int a) {
            if (l1 == null && l2 == null) {
                if (a > 0) ans.next = new ListNode(a);
                return;
            }
            int num1 = l1 == null ? 0 : l1.val;
            int num2 = l2 == null ? 0 : l2.val;
            int sum = num1 + num2 + a;
            ans.next = new ListNode(sum % 10);
            a = sum / 10;
            ans = ans.next;
            process(l1 == null ? null : l1.next, l2 == null ? null : l2.next, a);
        }
    }

}
