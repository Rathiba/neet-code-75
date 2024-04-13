package com.algo.practice.array;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Arrays;

public class TwoSum {

    public int[] sumByBruteForce(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public int[] sumByHashMap(int[] numbers, int target) {
        HashMap<Integer, Integer> hArray = new HashMap<>();
        //here key is array elements and value is index position
        for (int i = 0; i < numbers.length; i++) {
            int compliment = target - numbers[i];
            if (hArray.containsKey(compliment)) {
                return new int[]{hArray.get(compliment), i};
            }
            hArray.put(numbers[i], i);
        }
        return new int[]{};
    }

    public int[] sumByTwoPassHashMap(int[] numbers, int target) {
        HashMap<Integer, Integer> h2Array = new HashMap<>();
        /*using 2 for loop entering value to hashmap, hashmap doesn't allow duplicate value
        Previous case avoided by entering value to hashmap in final
        in this case we cheching codition
         */
        for (int i = 0; i < numbers.length; i++) {
            h2Array.put(numbers[i], i);
        }
        for (int i = 0; i < numbers.length; i++) {
            int sub = target - numbers[i];
            if (h2Array.containsKey(sub) && h2Array.get(sub) != i) {
                return new int[]{i, h2Array.get(sub)};
            }
        }
        return new int[]{};
    }


}
