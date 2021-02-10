package dp;

/**
 * @author shuxiahua
 * @version 1.0.0
 * @Title:
 * @Description:
 * @date 2020/12/27 14:30
 */
public class basic {

    /**
     * 青蛙跳台阶问题
     * @return
     */
    public static int frog(int n) {
        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i < n; i++ ) {
            dp[i] = dp[i-1] + dp[i-1];
        }
        return dp[n];
    }


    public static void main(String[] args) {

    }

}
