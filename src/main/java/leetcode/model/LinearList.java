package leetcode.model;

/**
 * @author shuxiahua
 * @Description: 线性表
 * @date 2021/2/23 22:12
 */
public interface LinearList {

    LinearList empty();

    int get(int index);

    int findIndex(int value);

    boolean insert(int index, int value);

    boolean delete(int index);

    int length();
}
