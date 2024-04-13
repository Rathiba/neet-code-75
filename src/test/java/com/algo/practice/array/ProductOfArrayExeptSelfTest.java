package com.algo.practice.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductOfArrayExeptSelfTest {
    private ProductOfArrayExeptSelf productOfArrayExeptSelf;

    @BeforeEach
    public void init() {
        productOfArrayExeptSelf = new ProductOfArrayExeptSelf();
    }

    @Test
    public void testproduct() {
        int[] nums = {1, 2, 3, 4};
        int[] expected = {24, 12, 8, 6};
        Assertions.assertArrayEquals(expected, productOfArrayExeptSelf.product(nums));
        Assertions.assertArrayEquals(expected, productOfArrayExeptSelf.productSimplified(nums));

    }

}
