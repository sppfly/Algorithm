package leetcode.model;

import org.junit.jupiter.api.Test;

import javax.management.Query;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;


/**
 * @author shuxiahua
 * @Description:
 * @date 2021/2/23 22:59
 */
class ListNodeTest {

    @Test
    void initByTail() {
        ListNode listNode = ListNode.initByTail(new int[]{1,2,3,4,5,6,7,45,3});
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    @Test
    void initByHead() {
        ListNode listNode = ListNode.initByHead(new int[]{1,2,3,4,5,6,7,45,3});
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }


    @Test
    void reverse() {
        ListNode listNode = ListNode.initByTail(new int[]{1,2,3,4,5,6,7,45,3});
        ListNode result = ListNode.reverse(listNode.next);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}