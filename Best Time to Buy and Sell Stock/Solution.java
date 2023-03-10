class Solution {
    public int maxProfit(int[] prices) 
    {
        
        int low = Integer.MAX_VALUE;
        int max = 0;
        int profit = 0;

        for (int i = 0; i < prices.length; i++)
        {
            if (prices[i] < low)
            {
                low = prices[i];
            }
            if (prices[i] - low > profit)
            {
                max = prices[i];
                profit = max - low;
            }

        }
        return profit;
    }  
}
