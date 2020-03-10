package com.hhuda.dpj.factory;

import java.text.NumberFormat;
import java.util.Calendar;

public class JavaFactoryPatterns {
    public static void main(String[] args) {
        //Calender is singleton class and uses factory pattern
        //factory pattern doesn't expose how objects are instantiated
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar);
        System.out.println(calendar.DAY_OF_MONTH);
    }
}
