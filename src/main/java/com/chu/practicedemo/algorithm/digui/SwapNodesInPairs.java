package com.chu.practicedemo.algorithm.digui;

/**
 * @ClassName SwapNodesInPairs
 * @Description TODO
 * @Author chufule
 * @Date 2021/8/13 14:06
 * @Version 1.0
 */
public class SwapNodesInPairs {


//    Definition for singly-linked list.
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode nextStepHead = head.next.next;
        ListNode next = head.next;
        next.next = head;
        head.next = swapPairs(nextStepHead);
        return next;
    }

}
