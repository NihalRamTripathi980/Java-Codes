package com.company;

import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {


        System.out.println("For Your  Total Age, Enter Your Date of Birth  = ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter YEAR :");
        int year = sc.nextInt();
        System.out.println("Enter MONTH :");
        int month = sc.nextInt();
        System.out.println("Enter DATE :");
        int date = sc.nextInt();
//        System.out.println("Enter TIME :");
//        float Time = sc.nextFloat();

        System.out.println("You Entered :  " + date + "/" + month + "/" + year);

        Calendar c = Calendar.getInstance();
        int Cyear = c.get(Calendar.YEAR);
        int CMonth = c.get(Calendar.MONTH);
        int Cdate = c.get(Calendar.DATE);

        int Tyear = Cyear - year;

        int countMonth = 1;
        for (int i = month; i <= 12; i++) {
            countMonth++;
        }
        int i =1;
       int  TMonth = countMonth + CMonth;





        int countDays=1;
        for (int j = date; j <= 30; j++) {
            countDays++;
        }
        int j=1;
        System.out.println(countDays);
       int  Tdays = countDays + Cdate;

        System.out.println("YOUR TOTAL AGE IS :" + Tyear + "Years" + TMonth + "Months" + Tdays + "Days");


    }
}
