package leetcode;

/**
 * @author shuxiahua
 * @Description: 买卖股票的最佳时机
 * @date 2021/4/17 20:38
 */
public class No121 {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;
        for (int i = 1; i< prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            profit = Math.max(profit, prices[i] - min);
        }
        return profit;
    }
}
