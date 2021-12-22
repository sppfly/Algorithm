package leetcode.dp;

/**
 * @author shuxiahua
 * @Description:
 * @date 2021/12/1 21:20
 */
public class No1137 {
    public int tribonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (n == 2) {
            return 1;
        }
        int[] dp = new int[n+1];
        dp[0]=0;
        dp[1]=1;
        dp[2]=1;
        for (int i=3; i<n+1; i++) {
            dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[n];
    }
}
