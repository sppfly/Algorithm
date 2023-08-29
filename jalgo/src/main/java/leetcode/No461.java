package leetcode;

/**
 * 计算汉明距离
 * 汉明距离指的是两个值的二进制表示的不同的位数，也就是两个值的异或结果的1的个数
 * 本题的解法转变为求一个int值的1的个数
 */
public class No461 {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
