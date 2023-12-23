package Array;

import java.util.Arrays;

public class 2706. Buy Two Chocolates {
    

    https://leetcode.com/problems/buy-two-chocolates/description/?envType=daily-question&envId=2023-12-20


}

SOLUTION :-

class Solution {
    public int buyChoco(int[] prices, int money) {
        // Sort the Array in Increasing Order
        Arrays.sort(prices);

        // Minimum Cost
        int minCost = prices[0] + prices[1];

        // We can buy chocolates only if we have enough money
        if (minCost <= money) {
            // Return the Amount of Money Left
            return money - minCost;
        } else {
            // We cannot buy chocolates. Return the initial amount of money
            return money;
        }
    }
}
