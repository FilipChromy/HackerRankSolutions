package com.personal.filip;

import java.util.ArrayList;
import java.util.List;

public class GradingProblem {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> finalGrades = new ArrayList<>();
        for (int i : grades) {
            if (i % 5 == 0) {
                finalGrades.add(i);
            } else {
                int j = i;
                while (j % 5 != 0) {
                    j++;
                }
                if (j - i < 3) {
                    if (j >= 40) {
                        finalGrades.add(j);
                    } else {
                        finalGrades.add(i);
                    }
                } else {
                    finalGrades.add(i);
                }
            }
        }
        return finalGrades;
    }
}
