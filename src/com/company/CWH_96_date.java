package com.company;

public class CWH_96_date {
    public static void main(String[] args) {


        // it's calculate millisecond from 1 january 1970   , currentTimeMillis()


        // for year
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);

        // for month
        System.out.println(System.currentTimeMillis()/1000/3600/24/365*12);


        // for days
        System.out.println(System.currentTimeMillis()/1000/3600/24);

        //for hours
        System.out.println(System.currentTimeMillis()/1000/3600);
    }
}
