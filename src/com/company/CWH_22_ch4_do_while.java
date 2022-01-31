package com.company;

import java.util.Scanner;

public class CWH_22_ch4_do_while {
    public static void main(String[] args) {
        System.out.println("enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        //int a=3;
        do{
            System.out.println(n);
            n++;

        }while (n<=10);
    }
}
