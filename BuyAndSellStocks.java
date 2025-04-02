// 121. Best Time to Buy and Sell Stock

// You are given an array prices where prices[i] is the price of a given stock on the ith day.
// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

import java.util.*;
public class BuyAndSellStocks
{
    public static void stocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0;i < prices.length;i++){
            if(buyPrice<prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit , profit);
            }
            else{
                buyPrice = prices[i];
            }
        }
        System.out.println("Maximum profit that can be achieved is "+maxProfit);
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n = sc.nextInt();
        int prices[] = new int[n];
		System.out.println("Enter the stock values:");
		for(int i = 0;i < n;i++){
		    prices[i] = sc.nextInt();
		}
        stocks(prices);
	}
}


// Time complexity:
// The input reading loop runs in O(n).
// The stocks() function also runs in O(n).
// Since these are sequential operations (not nested loops), the overall time complexity remains O(n).

