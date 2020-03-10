package com.hhuda.dpj.afactory;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/**
 * Example of Factor Methods in Java
 */
public class JFactories {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.CHINA);
        System.out.println(calendar.getFirstDayOfWeek());
    }
}
