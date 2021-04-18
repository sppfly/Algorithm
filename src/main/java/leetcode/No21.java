package leetcode;

import leetcode.model.ListNode;

/**
 * @author shuxiahua
 * @Description: 合并两个有序链表
 * @date 2021/4/4 20:01
 */
public class No21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode r;
        ListNode head = l1.val <= l2.val ? l1 : l2;
        ListNode thisSide = head, otherSide = l1.val <= l2.val ? l2 : l1;
        while (thisSide.next != null && otherSide.next != null) {
            while (thisSide.next.val < otherSide.val) {
                thisSide = thisSide.next;
            }
            r = thisSide.next;
            thisSide.next = otherSide;
            otherSide = r;
            thisSide = thisSide.next;
        }
        if (thisSide.next == null) {
            thisSide.next = otherSide;
        } else {
            otherSide.next = thisSide;
        }
        return head;
    }
}
