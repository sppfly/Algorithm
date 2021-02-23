package leetcode;

import leetcode.model.ListNode;

/**
 * @author shuxiahua
 * @Description:
 * @date 2021/2/12 12:49
 */
public class LinkList {




    /**
    * @Description: 2.两数相加
    * @author liuyi
    * @date 2021/2/12 12:51
    */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1.val == 0 && l2.val == 0) {
            return new ListNode(0);
        }
        int resultPerNode;
        ListNode head = null, tail = null;
        int carry = 0;
        while (l1 != null && l2 != null) {
            resultPerNode = l1.val + l2.val + carry;
            ListNode thisNode = new ListNode();
            thisNode.val = resultPerNode % 10;
            carry = resultPerNode / 10;
            if (head == null) {
                head = new ListNode();
                head.next = thisNode;
            }
            tail = thisNode;
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l1 == null) {
            tail.next = l2;
        } else {
            tail.next = l1;
        }
        return head.next;
    }
}
