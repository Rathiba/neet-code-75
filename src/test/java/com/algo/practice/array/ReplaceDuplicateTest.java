package com.algo.practice.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


import java.util.Arrays;
import java.util.stream.Stream;

public class ReplaceDuplicateTest{

    private ReplaceDuplicate replaceDuplicate;

    @BeforeEach
    public void init() {
        replaceDuplicate=new ReplaceDuplicate();  }

    @Test
    public void testReplaceDuplicate() {
        int[] nums = {1, 2, 2, 4};
        int[] arr = replaceDuplicate.findErrorNums (nums);
        Arrays.stream(arr).forEach(System.out::println);

       // int[] expectedIndex = {1,2,3,4,5};
       // Assertions.assertArrayEquals(expectedIndex,replaceDuplicate.findErrorNums (nums));
    }}
