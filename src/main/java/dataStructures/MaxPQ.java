package dataStructures;

/**
 * @author shuxiahua
 * @Description: 最大有限队列
 * @date 2021/4/15 22:00
 */
public interface MaxPQ {

    void insert(int v);

    int max();

    int popMax();

    boolean empty();

    int size();
}
