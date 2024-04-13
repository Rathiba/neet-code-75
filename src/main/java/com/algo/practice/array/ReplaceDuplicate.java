package com.algo.practice.array;

public class ReplaceDuplicate {
    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[nums.length];
        int[] res = new int[2];
        for(int i:nums){
            arr[i-1]++;
        }
        return arr;
    }
}
