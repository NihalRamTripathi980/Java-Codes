package com.company;

import java.util.Scanner;

public class CWH_05_TakingInput {
    public static void main(String[] args) {
      //  System.out.println("Taking Input From The User");
      //  Scanner sc = new Scanner(System.in);
      //  System.out.println("enter the first element");
       // int a = sc.nextInt();
       // System.out.println("enter the second element");
      //  int b= sc.nextInt();
      //  int sum = a+b;
     //   System.out.println("sum of the elements");
      //  System.out.println(sum);
        System.out.println("enter the first subject no.");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println("enter the second subject no.");
        int b= sc.nextInt();
        System.out.println("enter the third subject no,");
        int c= sc.nextInt();
        System.out.println("enter the fourth subject no.");
        int d= sc.nextInt();
        System.out.println("enter the fifth subject no.");
        int e = sc.nextInt();
        System.out.println("enter the total no.");
        int total= sc.nextInt();
        int percentage = (a+b+c+d+e)*100/total;
        System.out.println("percentage is");
        System.out.println(percentage);


    }
}
