package leetcode;

import leetcode.model.ListNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author shuxiahua
 * @Description: 判断是否是回文链表
 * @date 2021/4/17 20:52
 */
public class No234 {
    /**
     * @Description: 利用栈判断，时间复杂度O（N）空间复杂度O(N)
     * @author liuyi
     * @date 2021/4/17 21:04
     */
    public boolean isPalindrome1(ListNode head) {
        if (head.next == null) {
            return true;
        }
        ListNode p = head;
        Deque<Integer> deque = new LinkedList<>();
        while (p != null) {
            deque.push(head.val);
            p = p.next;
        }
        p = head;
        while (p!=null) {
            if (p.val != deque.pop()) {
                return false;
            }
            p = p.next;
        }
        return true;
    }
}
