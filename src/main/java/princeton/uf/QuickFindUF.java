package princeton.uf;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author shuxiahua
 * @Description:
 * @date 2021/4/20 21:54
 */
public class QuickFindUF implements UF{

    private int size;

    private int count;

    private int[] nums;

    public QuickFindUF(int size) {
        this.nums = new int[size];
        for (int i=0; i<size; i++) nums[i] = i;
        this.size = size;
        this.count = size;
    }

    public void union(int p, int q) {
        int phead = find(p);
        int qhead = find(q); 
        for (int i=0; i < this.size; i++) {
            if (find(i) == qhead) {
                nums[i] = phead;
            }
        }
        count--;
    }

    public int find(int p) {
        return nums[p];
    }


    boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    int count() {
        return count;
    }

    public static void main(String[] args) {
        int n = StdIn.readInt();
        QuickFindUF uf = new QuickFindUF(n);
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (uf.connected(p, q))
                continue;
            uf.union(p, q);
            StdOut.println(p + " " + q);
        }
        StdOut.println(uf.count() + " components");
    }

}
