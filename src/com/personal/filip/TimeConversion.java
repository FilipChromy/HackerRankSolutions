package com.personal.filip;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TimeConversion {
    public static String timeConversion(String s) {
        String output = null;
        try {
            DateFormat df = new SimpleDateFormat("hh:mm:ssa");
            DateFormat out = new SimpleDateFormat("HH:mm:ss");
            Date date = df.parse(s);
            output = out.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return output;
    }
}
