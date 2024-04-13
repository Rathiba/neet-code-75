package com.algo.practice.array;

public class ProductOfArrayExeptSelf {
    public int[] product(int nums[]) {
        int length = nums.length;
        int[] leftArr = new int[length];
        int[] rightArr = new int[length];
        int[] outputArr = new int[length];
        leftArr[0] = 1;
        rightArr[length - 1] = 1;
        for (int i = 1; i < length; i++) {
            leftArr[i] = nums[i - 1] * leftArr[i - 1];
        }
        for (int i = length - 2; i >= 0; i--) {
            rightArr[i] = nums[i + 1] * rightArr[i + 1];
        }
        for (int i = 0; i < length; i++) {
            outputArr[i] = leftArr[i] * rightArr[i];
        }
        return outputArr;
    }

    public int[] productSimplified(int nums[]) {
        int length = nums.length;
        int[] outputArr = new int[length];
        outputArr[0] = 1;
        for (int i = 1; i < length; i++) {
            outputArr[i] = nums[i - 1] * outputArr[i - 1];
        }
        int R = 1;

        for (int i = length - 1; i >= 0; i--) {
            outputArr[i] = outputArr[i] * R;
            R = R * nums[i];
        }
        return outputArr;
    }
}
