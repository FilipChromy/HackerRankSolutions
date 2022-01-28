package com.personal.filip;

import java.util.HashMap;
import java.util.Map;

public class TwoSumFaster {
    public static int[] twoSumSolution(int[] arr, int target) {
        Map<Integer, Integer> myMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (myMap.containsKey(complement)) {
                return new int[] {myMap.get(complement), i};
            }
            myMap.put(arr[i], i);
        }
        throw new IllegalArgumentException("No match found");
    }
}
