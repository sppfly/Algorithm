package dataStructures;

/**
 * @author shuxiahua
 * @Description: stack Api
 * @date 2021/3/9 20:49
 */
public interface MyStack {

    boolean isFull();

    boolean isEmpty();

    boolean push(int element);

    int pop();

    int peek();
}
