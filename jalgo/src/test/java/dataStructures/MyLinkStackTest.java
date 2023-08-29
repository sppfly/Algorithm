package dataStructures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author shuxiahua
 * @Description:
 * @date 2021/3/17 21:26
 */
class MyLinkStackTest {

    @Test
    void isFull() {
        MyLinkStack myLinkStack = new MyLinkStack();
        assertTrue(myLinkStack.isEmpty());
        assertTrue(!myLinkStack.isFull());
        for (int i = 0; i < 10; i++) {
            myLinkStack.push(i);
        }

        for (int i = 9; i >= 0; i--) {
//            System.out.println(myListStack.pop());
            assertEquals(myLinkStack.pop(), i);
        }
        myLinkStack.pop();
    }
}