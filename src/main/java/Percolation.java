import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {

    int[][] array;

    int openCount;

    int n;

    WeightedQuickUnionUF wuf;

    private boolean is_valid_addr(int... axis) {
        for (int i = 0; i < axis.length; i++) {
            if (axis[i] > n || axis[i] < 1) {
                return false;
            }
        }
        return true;
    }

    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n) {
        if (n <= 0) {
            throw new IllegalAccessError("n should be larger than 0");
        }
        this.array = new int[n + 1][n + 1];
        this.n = n;
        this.wuf = new WeightedQuickUnionUF(n * n);
        this.openCount = 0;
    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col) {
        if (!is_valid_addr(row, col)) {
            throw new IllegalAccessError("illegal address row = " + row + " col = " + col);
        }
        array[row][col] = 1;
        if (isOpen(row, col - 1)) {
            wuf.union(row * n + col, row * n + col - 1);
        } else if (isOpen(row, col + 1)) {
            wuf.union(row * n + col, row * n + col - 1);
        } else if (isOpen(row - 1, col)) {
            wuf.union(row * n + col, (row - 1) * n + col);
        } else if (isOpen(row + 1, col)) {
            wuf.union(row * n + col, (row + 1) * n + col);
        }
        openCount++;
    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col) {
        if (!is_valid_addr(row, col)) {
            throw new IllegalAccessError("illegal address row = " + row + " col = " + col);
        }
        return array[row][col] == 1;
    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col) {
        if (!is_valid_addr(row, col)) {
            throw new IllegalAccessError("illegal address row = " + row + " col = " + col);
        }
        return 
    }

    // returns the number of open sites
    public int numberOfOpenSites() {
        return openCount;
    }

    // does the system percolate?
    public boolean percolates() {

    }

    // test client (optional)
    public static void main(String[] args) {
        int n = 10;
        Percolation percolation = new Percolation(n);
        percolation.percolates();
    }
}
