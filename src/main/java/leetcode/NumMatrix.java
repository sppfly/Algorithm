package leetcode;

import java.util.Arrays;

/**
 * @author shuxiahua
 * @Description:
 * @date 2021/3/2 20:30
 */
class NumMatrix {
    //降低一个水平的复杂度，即用一维方法解决二维问题
    int[][] sums;

    public NumMatrix(int[][] matrix) {
        int m = matrix.length;
        if (m > 0) {
            int n = matrix[0].length;
            sums = new int[m][n + 1];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    sums[i][j + 1] = sums[i][j] + matrix[i][j];
                }
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        for (int i = row1; i <= row2; i++) {
            sum += sums[i][col2 + 1] - sums[i][col1];
        }
        return sum;
    }


    public static void main(String[] args) {
        NumMatrix numMatrix = new NumMatrix(new int[][]{{1}, {-7}});
        System.out.println(Arrays.deepToString(numMatrix.sums));
        System.out.println(numMatrix.sumRegion(1,0,1,0));

    }
}
