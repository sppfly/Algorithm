package dataStructures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author shuxiahua
 * @Description:
 * @date 2021/3/17 21:26
 */
class MyListStackTest {

    @Test
    void isFull() {
        MyListStack myListStack = new MyListStack();
        assertTrue(myListStack.isEmpty());
        assertTrue(!myListStack.isFull());
        for (int i = 0; i < 10; i++) {
            myListStack.push(i);
        }

        for (int i = 9; i >= 0; i--) {
//            System.out.println(myListStack.pop());
            assertEquals(myListStack.pop(), i);
        }
        myListStack.pop();
    }
}