package leetcode.dp;

/**
 * @author shuxiahua
 * @Description:
 * @date 2021/12/1 20:49
 */
public class No509 {
    public int fib(int n) {
        if (n==0 || n==1) {
            return n;
        }
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2; i < n+1; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
