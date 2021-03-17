package dataStructures;

/**
 * @author shuxiahua
 * @Description:
 * @date 2021/3/9 21:02
 */
public class MyArrayStack implements MyStack {

    /**
     * 保存栈元素的数组
     */
    private int[] value;

    /**
     * 栈顶位置
     */
    private int top;

    /**
     * 栈的大小
     */
    private int size;

    public MyArrayStack(int size) {
        this.value = new int[size];
        this.top = -1;
        this.size = size;
    }

    @Override
    public boolean isFull() {
        return top == size -1 ;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean push(int element) {
        if (isFull()) {
            throw new IllegalArgumentException("The stack is full");
        }
        value[top + 1] = element;
        top++;
        return true;
    }


    @Override
    public int pop() {
        if(isEmpty()) {
            throw new IllegalArgumentException("The stack is empty");
        }
        int result = value[top];
        top--;
        return result;
    }

    @Override
    public int peek() {
        if(isEmpty()) {
            throw new IllegalArgumentException("The stack is empty");
        }
        return value[top];
    }
}
