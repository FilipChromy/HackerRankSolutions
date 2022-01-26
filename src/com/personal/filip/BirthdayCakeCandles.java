package com.personal.filip;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BirthdayCakeCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {
        Collections.sort(candles, Collections.reverseOrder());
        int highestCandle = candles.get(0);
        int highestCandlesCount = 0;
        for (int i = 0; i < candles.size(); i++) {
            if (candles.get(i) == highestCandle) {
                highestCandlesCount++;
            } else {
                break;
            }
        }
        return highestCandlesCount;
    }
}
