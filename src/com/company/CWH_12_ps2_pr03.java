package com.company;
import java.util.Scanner;
public class CWH_12_ps2_pr03 {
    public static void main (String[] args){
        int s = 2;
        int a = 2;
        Scanner sc =  new Scanner(System.in);
       // int a = sc.nextInt();
       // System.out.println(a>8);

        System.out.println("enter the v value");
        int v = sc.nextInt();
        System.out.println("enter the  u value");
        int u = sc.nextInt();
        int x =( v*v - u*u)/(2*a*s);
        System.out.println(x);
    }
}
