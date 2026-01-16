package Arrays;

public class BestTimeToBuyStock {
    static void main() {
        maxProfit(new int[]{1, 3, 4, 5, 6, 7, 8, 9});
    }

    static public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
}
