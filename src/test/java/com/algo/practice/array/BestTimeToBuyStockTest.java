package com.algo.practice.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class BestTimeToBuyStockTest {
    private BestTimeToBuyStock bestTimeToBuyStock;

    @BeforeEach
    public void myCreation() {
        bestTimeToBuyStock = new BestTimeToBuyStock();
    }

    @Test
    public void testbestTimeToBuyStock() {
        int[] price = {7, 1, 5, 3, 6, 4};
        int expected = 5;
        Assertions.assertEquals(expected, bestTimeToBuyStock.maxProfitBruteforce(price));
        Assertions.assertEquals(expected, bestTimeToBuyStock.maxProfitByMathfunction(price));
    }
}
