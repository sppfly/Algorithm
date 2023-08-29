package leetcode;

import leetcode.model.ListNode;

/**
 * @author shuxiahua
 * @Description: 删除链表的倒数第N个节点
 * @date 2021/3/25 20:51
 */
class No19 {
    /**
     * @Description: 双指针解
     * @author liuyi
     * @date 2021/3/25 20:55
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int i = 0;
        ListNode x = head, y = head, pre = head;
        while (x.next != null) {
            if (i < n) {
                i++;
            } else {
                pre = y;
                y = y.next;
            }
            x = x.next;
        }
        if (x==y) {
            pre.next = null;
        } else {
            y.val = y.next.val;
            y.next = y.next.next;
        }
        return head;
    }
}