package dataStructures;

/**
 * @author shuxiahua
 * @Description:
 * @date 2021/3/17 22:36
 */
public interface MyQueue {


    boolean isFull();

    boolean isEmpty();

    /**
     * 入队
     * @return
     */
    boolean add();

    /**
     * 出队
     * @return
     */
    boolean delete();

    /**
     * 获取队尾元素，但是不出队
     * @return
     */
    int rear();
}
