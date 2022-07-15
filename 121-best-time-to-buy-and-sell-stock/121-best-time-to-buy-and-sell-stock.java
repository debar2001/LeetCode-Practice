class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        int n = prices.length;
        for(int i=0; i<n; i++){
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i]-minPrice);
        }
        return maxProfit;
    }
}