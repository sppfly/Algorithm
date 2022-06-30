package princeton.PQ;

import java.util.Random;

import utils.Utils;

public class MaxPQ {


    int limit;

    // 始终指向堆的末尾
    int cur;


    int[] array;

    MaxPQ(int[] a) {

    }

    MaxPQ(int limit) {
        this.limit = limit;
        this.array = new int[limit+1];
        this.cur = 0;
    }


    /**
     * 让第i个元素上浮
     * @param i
     */
    private void swim(int i) {
        while (i > 1) {
            if (array[i] < array[i/2]) {
                break;
            }
            Utils.swap(array, i, i/2);
            i /= 2;
        }
    }

    void insert(int key) throws Exception {
        if (cur == limit) {
            throw new Exception("heap full");
        }
        array[++cur] = key;
        swim(cur);
    }


    int max() {
        return array[1];
    }


    /**
     * 让第i个元素下沉
     * @param i
     */
    void sink(int i) {
        while (i < cur && 2*i <= cur) {
            int maxi = 2*i;
            if (maxi+1 <= cur && array[maxi+1] > array[maxi]) {
                maxi = maxi + 1;
            }
            if (array[i] > array[maxi]) {
                break;
            }
            Utils.swap(array, i, maxi);
            i = maxi;
        }
    }

    int delMax() {
        Utils.swap(array, 1, cur--);
        sink(1);
        int max = array[cur+1];
        array[cur+1] = 0;
        return max;
    }


    boolean isEmpty() {
        return this.size() == 0;
    }

    int size() {
        return cur;
    }

    
    public static void main(String[] args) throws Exception {
        MaxPQ maxPQ = new MaxPQ(1000);
        Random random = new Random();
        for (int i=0; i<999; i++) {
            maxPQ.insert(random.nextInt(10000));
        }
        for (int i=0; i<999; i++) {
            System.out.println(maxPQ.delMax());
        }
    }
}