package princeton;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.UF;

/**
 * @author shuxiahua
 * @Description:
 * @date 2021/4/20 21:54
 */
public class UnionFind {

    private int size;

    public UnionFind(int size) {
        this.size = size;
    }

    void union(int p, int q) {

    }

    boolean connected(int p, int q) {
        return false;
    }


    public static void main(String[] args) {
        int n = StdIn.readInt();
        UF uf = new UF(n);
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (uf.connected(p, q)) continue;
            uf.union(p, q);
            StdOut.println(p + " " + q);
        }
        StdOut.println(uf.count() + " components");
    }

}
