package dataStructures;

/**
 * @author shuxiahua
 * @Description: 用两个栈实现一个队列
 * 由于栈是FILO，队列是FIFO，则栈里要出队的元素再入一次栈就可以FIFO了
 * @date 2021/3/17 22:39
 */
public class DoubleStackOneQueue implements MyQueue{
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
    public boolean rear() {
        return false;
    }
}
