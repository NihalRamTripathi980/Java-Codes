package com.company;

import java.util.Scanner;

public class cWH_23_ch4_for_loop {
    public static void main(String[] args) {
        System.out.println("enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0;i<=n;i++){
          //  if (i%2==1)
            System.out.println(2*i+1);
        }
        for (int a=10;a>0;a--){
            System.out.println(a);
        }
    }
}
