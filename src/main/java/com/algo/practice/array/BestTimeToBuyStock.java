package com.algo.practice.array;

public class BestTimeToBuyStock {
    int max = 0;

    public int maxProfitBruteforce(int[] price) {
        for (int i = 0; i < price.length; i++) {
            for (int j = i + 1; j < price.length; j++) {
                int newPrice = price[j] - price[i];
                if (newPrice > max) {
                    max = newPrice;
                }
            }
        }
        return max;
    }

    public int maxProfitByMathfunction(int[] price) {
        if (price == null || price.length <= 1)
            return 0;
        int minPrice = price[0];
        int profit = 0;
        for (int i = 0; i < price.length; i++) {
            minPrice = Math.min(minPrice, price[i]);
            profit = Math.max(profit, price[i] - minPrice);
        }
        return profit;
    }

}
