package dataStructures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author shuxiahua
 * @Description:
 * @date 2021/3/17 22:26
 */
class OneArrayTwoStackTest {

    @Test
    void test() {
        OneArrayTwoStack stack = new OneArrayTwoStack(10);
        assertTrue(stack.isEmpty(0));
        assertTrue(stack.isEmpty(1));
        for(int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                stack.push(i, OneArrayTwoStack.WHICH.LEFT);
            } else {
                stack.push(i, OneArrayTwoStack.WHICH.RIGHT);
            }
        }
        assertTrue(stack.isFull());
        for (int i = 9; i>=0; i--) {
            if(i % 2 == 0) {
                assertEquals(i, stack.pop(OneArrayTwoStack.WHICH.LEFT));
            } else {
                assertEquals(i, stack.pop(OneArrayTwoStack.WHICH.RIGHT));
            }
        }
        assertTrue(stack.isEmpty(0));
        assertTrue(stack.isEmpty(1));
    }
}