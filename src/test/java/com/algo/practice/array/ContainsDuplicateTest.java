package com.algo.practice.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContainsDuplicateTest {
    private ContainsDuplicate containsDuplicate;

    @BeforeEach
    public void induplicate() {
        containsDuplicate = new ContainsDuplicate();
    }

    @Test
    public void testDuplicate()
    {
        int[] nums = {1, 2, 3, 4, 1};
        Assertions.assertTrue(containsDuplicate.containsDuplicateByBruteForce(nums));
    }
}
