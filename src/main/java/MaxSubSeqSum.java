import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.Arrays;

/**
 * @author shuxiahua
 * @version 1.0.0
 * @Title:
 * @Description:
 * @date 2020/11/20 23:06
 */
public class MaxSubSeqSum {


    /**
    * @Description: 暴力法求解最大子列和问题，O(N3)
    * @author liuyi
    * @date 2020/11/20 23:13
    */
    public static int MaxSubSeqSum1(int[] a) {
        int max = 0;
        for (int i=0; i<a.length; i++) {
            for (int j=i+1; j<a.length; j++) {
                int thisMax = 0;
                for (int k=i; k<=j; k++) {
                    thisMax += a[k];
                }
                if (max<thisMax) {
                    max = thisMax;
                }
            }
        }
        return max;
    }

    /**
     * 优化暴力法解决，O(N2)
     * @param a
     * @return
     */
    public static int MaxSubSeqSum(int[] a) {
        int max = 0;
        for (int i=0; i<a.length; i++) {
            int thisSum = 0;
            for (int j=i; j<a.length; j++) {
                thisSum += a[j];
                if (thisSum > max) {
                    max = thisSum;
                }
            }
        }
        return max;
    }

    /**
     * 动态规划解最大子序列和
     * @param nums
     * @return
     */
    public static int dpMax(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = Math.max(0, nums[0]);
        for (int i = 1; i< nums.length; i++) {
            dp[i] = Math.max(nums[i], nums[i] + dp[i - 1]);
        }
        int max = 0;
        for (int j : dp) {
            max = Math.max(max, j);
        }
        return max;
    }



    public static int MaxSubSeqSum3(int[] a) {
        return divideAndConquer(a, 0, a.length - 1);
    }

    private static int divideAndConquer(int[] a, int left, int right) {
        int mid = (left + right) / 2;
        if (left == right) {
            return a[left];
        }
        int leftSum = divideAndConquer(a, left, mid);
        int rightSum = divideAndConquer(a, mid + 1, right);
        int midLeftSum = 0, midRightSum = 0, midLeftSumMax = a[mid], midRightSumMax = a[mid];
        for (int i = mid; i >= left; i--) {
            midLeftSum+=a[i];
            midLeftSumMax = Math.max(midLeftSum, midLeftSumMax);
        }
        for (int i = mid + 1; i <= right; i++) {
            midRightSum+=a[i];
            midRightSumMax = Math.max(midRightSum, midRightSumMax);
        }
        int crossSum = midLeftSumMax + midRightSumMax;
        return max(leftSum, rightSum, crossSum);
    }



    public static int max(int... a) {
        if (a.length == 0) {
            throw new IllegalArgumentException("number can't be null");
        }
        int max = a[0];
        for (int j : a) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

}
