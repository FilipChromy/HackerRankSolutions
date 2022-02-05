package com.personal.filip;

import java.util.HashSet;

public class DrawingBook {
    public static int pageCount(int n, int p) {
        HashSet<Integer> pages = new HashSet<>();
        int temp = 1;
        pages.add(1);
        pages.add(n);
        pages.add(n - 1);
        int pageFlips = 0;
        while (!pages.contains(p)) {
            pageFlips++;
            temp++;
            pages.add(temp);
            pages.add(temp + 1);
            pages.add(n - temp);
            pages.add(n - (temp + 1));
        }
        return pageFlips;
    }
}
