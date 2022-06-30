package dataStructures;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author shuxiahua
 * @Description:
 * @date 2021/4/6 16:26
 */
public class MyConcurrentHashMap {


    private  static final int N = 16;

    private int[] array;

    private ReentrantLock[] locks = new ReentrantLock[N];

    public void put(int key, int value) {
        //计算i的hash值
        int hash = 0;
        //并得出对应的数组的位置
        Integer index  = null;
        ReentrantLock lock = locks[(int) Math.floor(index / array.length) * N];
        lock.lock();
        try {
            //put方法
        } finally {
            lock.unlock();
        }
    }


    public void get(int key) {
        //计算i的hash值
        int hash = 0;
        //，并得出对应的数组的位置
        int index = 0;
        ReentrantLock lock = locks[(int) Math.floor(index / array.length) * N];
        lock.lock();
        try {
            //get方法
        } finally {
            lock.unlock();
        }
    }
}
