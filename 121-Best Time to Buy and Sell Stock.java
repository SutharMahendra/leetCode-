//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0

/*
 * Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 */

// here we define peofit initialize that is zero 
/*
 1.i assume that buy product at value of first element that store in min variable
 2.now substract min with price in iteration and store in result
 3.compare profit and result and maximum value store in profit that gives maximum profit 
 4.compare min and prices[i] and minimum value store in min that gives min perches rate 
 5.do it until the last element of array
 */

class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0;
        int min = prices[0];
        int result = 0;
        for (int i = 0; i < n; i++) {
            result = prices[i] - min;
            profit = Math.max(profit, result);
            min = Math.min(min, prices[i]);
        }

        return profit;
    }
}