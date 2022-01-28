package com.personal.filip;

import java.util.ArrayList;
import java.util.List;

public class BreakingBestAndWorstRecords {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        List<Integer> results = new ArrayList<>();
        int highestScore = scores.get(0);
        int lowestScore = scores.get(0);
        int brokenHighest = 0;
        int brokenLowest = 0;
        for (int i = 1; i < scores.size(); i++) {
            if (scores.get(i) > highestScore) {
                brokenHighest++;
                highestScore = scores.get(i);
            } else if (scores.get(i) < lowestScore) {
                brokenLowest++;
                lowestScore = scores.get(i);
            }
        }
        results.add(brokenHighest);
        results.add(brokenLowest);
        return results;
    }
}
