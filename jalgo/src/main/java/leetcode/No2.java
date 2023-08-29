package leetcode;

import leetcode.model.ListNode;

/**
 * @author shuxiahua
 * @Description: 两数相加 T100 M58
 * @date 2021/4/2 22:35
 */
public class No2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p = l1, q = l2;
        ListNode head = new ListNode();
        ListNode tail = head;
        int carry = 0;
        while(p != null && q != null) {
            ListNode current = new ListNode();
            current.val = (p.val + q.val + carry) % 10;
            carry = (p.val + q.val + carry) / 10;
            tail.next = current;
            tail = current;
            p=p.next;
            q=q.next;
        }
        if (p==null) {
            while (q!=null) {
                ListNode current = new ListNode();
                current.val =  (q.val + carry) % 10;
                carry = (q.val + carry) / 10;
                tail.next = current;
                tail = current;
                q=q.next;
            }
            if (carry!=0) {
                ListNode current = new ListNode();
                current.val =  carry;
                tail.next = current;
            }
        } else {
            while (p!=null) {
                ListNode current = new ListNode();
                current.val =  (p.val + carry) % 10;
                carry = (p.val + carry) / 10;
                tail.next = current;
                tail = current;
                p=p.next;
            }
            if (carry!=0) {
                ListNode current = new ListNode();
                current.val =  carry;
                tail.next = current;
            }
        }
        return head;
    }
}
