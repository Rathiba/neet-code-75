package com.algo.practice.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TwoSumTest {

    private TwoSum twoSum;

    @BeforeEach
    public void init() {
        twoSum = new TwoSum();
    }

    @Test
    public void testSum() {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] expectedIndex = {3, 4};
        Assertions.assertArrayEquals(expectedIndex, twoSum.sumByBruteForce(numbers, 9));
    }

    @ParameterizedTest
    @MethodSource("inputParams")
    public void testSumByBruteForce(int[] expectedIndex, int[] numbers, int target) {
        Assertions.assertArrayEquals(expectedIndex, twoSum.sumByBruteForce(numbers, target));
    }

    @ParameterizedTest
    @MethodSource("inputParams")
    public void sumByHashMap(int[] expectedIndex, int[] numbers, int target) {
        Assertions.assertArrayEquals(expectedIndex, twoSum.sumByHashMap(numbers, target));
        Assertions.assertArrayEquals(expectedIndex, twoSum.sumByTwoPassHashMap(numbers, target));
    }

    private static Stream<Arguments> inputParams() {
        return Stream.of(
                Arguments.of(new int[]{3, 4}, new int[]{1, 2, 3, 4, 5}, 9),
                Arguments.of(new int[]{0, 1}, new int[]{3, 3}, 6)
        );
    }

}
