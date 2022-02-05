package com.personal.filip;

import java.util.*;

public class ClimbingLeaderboard {
    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> results = new ArrayList<>();
        Stack<Integer> ranking = new Stack<>();
        for (int i : ranked) {
            if (ranking.isEmpty() || ranking.peek() != i) {
                ranking.push(i);
            }
        }
        for (int j : player) {
             while (!ranking.isEmpty() && ranking.peek() <= j) {
                 ranking.pop();
             }
             results.add(ranking.size() + 1);
        }
        return results;
    }
}
