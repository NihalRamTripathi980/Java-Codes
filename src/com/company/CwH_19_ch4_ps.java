package com.company;

import java.util.Scanner;

public class CwH_19_ch4_ps {
    public static void main(String[] args) {

        // Question 2
      /*  byte m1,m2,m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Physics Number");
         m1 = sc.nextByte();
        System.out.println("Enter your Chemistry Number");
         m2 = sc.nextByte();
        System.out.println("Enter your  Math Number");
        m3 = sc.nextByte();

        float avg = (m1 + m2 + m3)/3.0f;
        System.out.println("Your Overall average is:"+ avg);

        if ( avg >= 40 && m1 >= 33 && m2 >= 33 && m3 >= 33) {
            System.out.println("Congratulations you are pass");
        }
        else {
            System.out.println(" sorry you are fail");
        }




             if (m1>=33){
             System.out.println(" \tpass in physics");
         }
             else {
                 System.out.println("you are fail in physics");
             }
         if (m2 >= 33){
             System.out.println("\tpass in chemistry");
         }
         else {
             System.out.println("\tyou are fail in chemistry");
         }
         if (m3 >=33){
             System.out.println("\tpass in math");
         }
         else{
             System.out.println("you are fail in math");
         }



       */

      // Question 3
        /*
        System.out.println("Enter your income in lakhs");
        float tax = 0;
        Scanner sc = new Scanner(System.in);
        float income = sc.nextFloat();

        if (income<=2.5f){
            tax = tax +0;
        }
        else if(income >2.5f && income <=5.0f ){
            tax = tax + 0.05f *(income -2.5f);
        }
       else if (income >5.0f && income <=10.0f){
            tax= tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.20f *(income - 5.0f);
        }

       else if (income >10.0f){
           tax = tax + 0.05f * (5.0f - 2.5f);
           tax = tax +  0.20f* (10.0f - 5.0f);
           tax = tax + 0.30f * ( income - 10.0f);
        }
        System.out.println("Your tax is :" +tax);

         */
        
        // Question no. 4
        /*
        System.out.println("Enter day number");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch (day){
            case 1 ->System.out.println("Today is monday");

            case 2 ->System.out.println("Today is Tuesday");

            case 3 -> System.out.println(" Today is wednesday") ;
            case 4 -> System.out.println(" Today is thursday") ;
            case 5-> System.out.println(" Today is firday ") ;
            case 6 -> System.out.println(" Today is saturday") ;
            case 7 -> System.out.println(" Today is sunday") ;
              }
            */

       // Question 5
        /*
        System.out.println("enter the year");
        Scanner sc = new Scanner(System.in) ;
        int year = sc.nextInt();
        if(year%4==0 && year%100 !=0){
            System.out.println(" Entered year is a leap year");
        }
        else
        {
            System.out.println(" enter year is not a  leap  year");
        }

         */
        // Question no. 6
        Scanner sc = new Scanner(System.in);
        String website = sc.next() ;
        if (website.endsWith(".com")){
            System.out.println("Commercial website");
        }
        else if (website.endsWith(".in")) {
            System.out.println("indian website");
        }
       else if (website.endsWith(".org")){
            System.out.println(" Organizational website");
        }

    }
}
