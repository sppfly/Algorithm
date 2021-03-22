package dataStructures;

/**
 * @author shuxiahua
 * @Description: 链队列，链表的头为队尾，即出队一端，链表的尾为入队一端，相反做法需要保存队列前面一个位置
 * @date 2021/3/18 20:17
 */
public class MyLinkQueue implements MyQueue{

    private Node front;

    private Node rear;

    private int size;

    /**
     * 链栈的一个节点
     */
    private class Node {
        int value;
        MyLinkQueue.Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }

        public Node() {
        }
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
    public boolean rear() {
        return false;
    }
}
