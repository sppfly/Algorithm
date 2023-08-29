package leetcode;

import leetcode.model.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author shuxiahua
 * @Description:
 * @date 2021/4/18 10:40
 */
class No19Test {

    @Test
    void test() {
        No19 no19 = new No19();
        no19.removeNthFromEnd(new ListNode(1), 1);
    }
}