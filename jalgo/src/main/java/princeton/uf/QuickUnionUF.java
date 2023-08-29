package princeton.uf;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class QuickUnionUF implements UF {

    private int count;

    private int size;


    private int[] sz;

    int[] nums;



    QuickUnionUF (int size) {

        this.size = size;
        this.count = size;
        this.nums = new int[size];
        this.sz = new int[size];
        for (int i=0; i<size; i++) {
            this.nums[i] = i;
            this.sz[i] = 1;
        }

    }

    int count() {
        return count;
    }


    boolean connected(int p, int q) {
        return find(p) == find(q);
    }


    @Override
    public void union(int p, int q) {
        int phead = find(p);
        int qhead = find(q);

        if (phead == qhead) return;

        if (sz[phead] > sz[qhead]) {
            nums[qhead] = phead;
            sz[phead] += sz[qhead];        
        } else {
            nums[phead] = qhead;
            sz[qhead] += sz[phead];        
        } 
        count--;
    }

    @Override
    public int find(int p) {
        if (nums[p] != p) {
            return find(nums[p]);
        }
        return p;
    }

    public static void main(String[] args) {
        int n = StdIn.readInt();
        QuickUnionUF uf = new QuickUnionUF(n);
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
