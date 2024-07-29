class Solution {
    public int maxProfit(int[] prices) {
        int buy, profit,curr_profit;
        buy = prices[0];
        profit = 0;

        for(int sell:prices)
        {
            curr_profit = sell-buy;
            if(curr_profit > profit)
                profit = curr_profit;
            if(sell<buy)
                buy = sell;
        }
        return profit;
    }
}
