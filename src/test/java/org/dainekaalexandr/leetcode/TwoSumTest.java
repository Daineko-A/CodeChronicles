package org.dainekaalexandr.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {

    @Test
    void testTwoSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = TwoSum.twoSum(nums, target);
        assertArrayEquals(new int[]{0, 1}, result);
    }
}