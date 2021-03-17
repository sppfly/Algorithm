package dataStructures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author shuxiahua
 * @Description:
 * @date 2021/3/13 14:29
 */
class MyArrayStackTest {


    @Test
    void isFull() {
        MyArrayStack stack = new MyArrayStack(10);
        assertFalse(stack.isFull());
        assertTrue(stack.isEmpty());
        for (int i = 0; i< 10; i++) {
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
        }
    }

    @Test
    void isEmpty() {
    }

    @Test
    void push() {
    }

    @Test
    void pop() {
    }

    @Test
    void peek() {
    }
}