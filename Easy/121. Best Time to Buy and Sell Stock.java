/* 121. Best Time to Buy and Sell Stock
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0. */


class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0;i < prices.length;i++){
            buyPrice = Math.min(buyPrice,prices[i]);
            maxProfit = Math.max(maxProfit,prices[i]-buyPrice);
        }
        return maxProfit;
    }
}


/* Time Complexity : O(n) 
  Space Complexity : O(1)
*/
