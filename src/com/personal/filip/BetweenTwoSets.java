package com.personal.filip;

import java.util.List;

public class BetweenTwoSets {
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int validValues = 0;
        for (int i = 1; i <= 100; i++) {
            boolean validA = true;
            boolean validValue = false;
            for (int j : a) {
                if (i % j != 0) {
                    validA = false;
                    break;
                }
            }
            if (validA) {
                boolean validB = true;
                for (int x : b) {
                    if (x % i != 0) {
                        validB = false;
                        break;
                    }
                }
                if (validB) {
                    validValue = true;
                }
            }
            if (validValue) {
                validValues++;
            }
        }
        return validValues;
    }
}
