package leetcode;

import leetcode.model.ListNode;

/**
 * @author shuxiahua
 * @Description: 环形链表
 * @date 2021/3/25 21:36
 */
public class No141 {
    /**
     * @Description: 快慢指针
     * @author liuyi
     * @date 2021/3/25 21:46
     */
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode p = head, q = head;
        while (p.next != null && q.next != null && q.next.next != null) {
            p = p.next;
            q = q.next.next;
            if (p == q) {
                return true;
            }
        }
        return false;
    }
}
