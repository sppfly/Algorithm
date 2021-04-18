package dataStructures;

/**
 * @author shuxiahua
 * @Description:
 * @date 2021/4/15 22:01
 */
public class Heap implements MaxPQ{

    private int[] array;


    public Heap(int[] array) {
        this.array = array;
    }

    public Heap(int size) {
        this.array = new int[size];
    }


    private void swim() {

    }

    @Override
    public void insert(int v) {

    }

    @Override
    public int max() {
        return 0;
    }

    @Override
    public int popMax() {
        return 0;
    }

    @Override
    public boolean empty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
