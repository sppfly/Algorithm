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
        if (head.next == null) {
            if (n == 0) {
                return head;
            } else {
                return null;
            }
        }
        //p is the former node and q is the latter
        ListNode p = head, q = head;
        q.next = head;
        int i = 0;
        while(p.next != null) {
            p = p.next;
            if (i < n) {
                i++;
            } else {
                q = q.next;
            }
        }
        q.next = q.next.next;
        return head;
    }
}