package dataStructures;

import dataStructures.exception.DataStructureException;

/**
 * @author shuxiahua
 * @Description: 链队列，链表的头为队尾，即出队一端，链表的尾为入队一端，相反做法需要保存队列前面一个位置
 * @date 2021/3/18 20:17
 */
public class MyLinkQueue implements MyQueue{

    /**
     * 链表头但是是队尾，出队从front端出
     */
    private Node head;

    /**
     * 链表尾，入对从end入队
     */
    private Node rear;

    private int size;

    /**
     * 链队列的一个节点
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


    public MyLinkQueue() {
        this.size = 0;
        this.head = new Node();
        this.rear = new Node();
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
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
        if (size == 0) {
            throw new DataStructureException("");
        }
        return head.next.value;
    }
}
