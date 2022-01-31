package com.company;

import java.sql.SQLOutput;
import java.sql.Time;
import java.util.Date;

public class CWH_97_date_class {
    int s=0;
    public static void main(String[] args) {

//        System.out.println(Long.MAX_VALUE);
//        System.out.println(System.currentTimeMillis()) ;
//
int mybirthyear =2000;
int myBirthMonth = 12;

Date d = new Date();
        System.out.println(d);
        System.out.println(d.getYear()+1900);
        System.out.println(d.getMonth()+1);

        // my calculation

      int   CurrentYear = d.getYear() +1900 ;
        int My_Age = CurrentYear - mybirthyear;
        int My_Month = d.getMonth()+1 -myBirthMonth;

        System.out.println("Year :"+ My_Age+" ,Month :"+ My_Month);









    }
}
