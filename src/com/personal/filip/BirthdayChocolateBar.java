package com.personal.filip;

import java.util.List;

public class BirthdayChocolateBar {
    public static int birthday(List<Integer> s, int d, int m) { // 4, 2
        int possibleSplits = 0;
        for (int i = 0; i <= s.size() - m; i++) {
            int temp = 0;
            for (int j = i; j < i + m; j++) {
                temp += s.get(j);
            }
            if (temp == d) {
                possibleSplits++;
            }
        }
        return possibleSplits;
    }
}
