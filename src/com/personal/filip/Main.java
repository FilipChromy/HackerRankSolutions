package com.personal.filip;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> ranked = new ArrayList<>();
        ranked.add(100);
        ranked.add(90);
        ranked.add(90);
        ranked.add(80);
        ranked.add(75);
        ranked.add(60);
        List<Integer> player = new ArrayList<>();
        player.add(50);
        player.add(65);
        player.add(77);
        player.add(90);
        player.add(102);
        System.out.println(ClimbingLeaderboard.climbingLeaderboard(ranked, player));
    }
}
