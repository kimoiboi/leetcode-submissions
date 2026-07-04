class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int maxProfit = 0;
        while(r < prices.length){
            if(prices[l] > prices[r]){
                l = r;
            }else if(prices[l] < prices[r]){
                int profit = prices[r] - prices[l];
                if(maxProfit < profit){
                    maxProfit = profit;
                }
            }
            r++;
        }
        return maxProfit;
    }
}
