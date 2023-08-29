package dataStructures;

/**
 * @author shuxiahua
 * @Description: 循环数组实现队列
 * @date 2021/3/17 22:43
 */
public class MyArrayQueue implements MyQueue{


    private int[] array;

    private int front;

    private int rear;

    private int size;

    public MyArrayQueue(int initialSize) {
        array = new int[initialSize];
        size = 0;
        front = 0;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean add() {
        return false;
    }

    @Override
    public boolean delete() {
        return false;
    }

    @Override
    public int rear() {
        return 0;
    }
}
