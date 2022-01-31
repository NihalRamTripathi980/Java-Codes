package com.company;

import java.util.Calendar;
import java.util.TimeZone;

public class CWH_98_CalenderClass {
    public static void main(String[] args) {

//        Calendar c =  Calendar.getInstance();
//        System.out.println(c.getCalendarType());
//        System.out.println(c.getTimeZone());
//        System.out.println(c.getTime());

        Calendar c =  Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        System.out.println(c.getTime());



    }
}
