package greedy;

public class L122 {
    public int maxProfit(int[] prices) {
        int profits = 0;
        for (int i = 1; i < prices.length; i++) {
            profits += Math.max(0, prices[i] - prices[i - 1]);
        }
        return profits;
    }
}
