package dataStructures;

import dataStructures.exception.DataStructureException;

/**
 * @author shuxiahua
 * @Description:
 * @date 2021/3/17 21:40
 */
public class OneArrayTwoStack {


    static class WHICH {
        static final int LEFT = 0;
        static final int RIGHT = 1;
    }

    private int[] array;

    private int leftTop;

    private int rightTop;

    public OneArrayTwoStack(int initialSize) {
        array = new int[initialSize];
        leftTop = -1;
        rightTop = initialSize;
    }

    public boolean isFull() {
        return rightTop - 1 == leftTop;
    }

    /**
     * left 0 ,right 1
     * @param which
     * @return
     */
    public boolean isEmpty(int which) {
        return which == WHICH.LEFT ? leftTop == -1 : rightTop == array.length;
    }

    public boolean push(int element, int which) {
        if (isFull()) {
            throw new DataStructureException("The stack is full");
        }
        if (which == WHICH.LEFT) {
            array[++leftTop] = element;
        } else if (which == WHICH.RIGHT) {
            array[--rightTop] = element;
        } else {
            throw new DataStructureException("Which not fitted");
        }
        return true;
    }

    public int pop(int which) {
        if (isEmpty(which)) {
            throw new DataStructureException("The stack is full");
        }
        if (which == WHICH.LEFT) {
            return array[leftTop--];
        } else if (which == WHICH.RIGHT) {
            return array[rightTop++];
        } else {
            throw new DataStructureException("Which not fitted");
        }
    }

    public int peek(int which) {
        if (isEmpty(which)) {
            throw new DataStructureException("The stack is full");
        }
        if (which == WHICH.LEFT) {
            return array[leftTop];
        } else if (which == WHICH.RIGHT) {
            return array[rightTop];
        } else {
            throw new DataStructureException("Which not fitted");
        }
    }
}
