package dataStructures;

import dataStructures.exception.DataStructureException;

/**
 * @author shuxiahua
 * @Description: 链栈，没有大小限制
 * @date 2021/3/13 14:58
 */
public class MyLinkStack implements MyStack{


    private Node head;

    private int size;

    /**
     * 链栈的一个节点
     */
    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }

        public Node() {
        }
    }

    public MyLinkStack() {
        this.head = new Node();
        this.size = 0;
    }

    @Override
    public boolean isFull() {
        //链栈永远不能满
        return false;
    }

    @Override
    public boolean isEmpty() {
        return head.next == null;
    }

    @Override
    public boolean push(int element) {
        Node next = new Node(element);
        next.next = head.next;
        head.next = next;
        return true;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            throw new DataStructureException("The stack is Empty");
        }
        Node p = head.next;
        head.next = p.next;
        int i = p.value;
        //防止内存泄漏
        p = null;
        return i;
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            throw new DataStructureException("The stack is Empty");
        }
        return head.next.value;
    }
}
