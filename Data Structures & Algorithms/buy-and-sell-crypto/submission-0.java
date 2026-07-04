class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;

        //wrong
        //int n = prices.length;
        // int k = 2; //length of subarray
        int minPrices = prices[0]; //cheapest day to buy (left)
        int maxProfit = 0;

        for (int i =1; i< prices.length; i++){
            maxProfit = Math.max(maxProfit, prices[i] - minPrices);
            minPrices = Math.min(minPrices, prices[i]);
        }
        return maxProfit;

    }
}
