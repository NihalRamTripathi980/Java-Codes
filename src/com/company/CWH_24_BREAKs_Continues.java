package com.company;

public class CWH_24_BREAKs_Continues {
    public static void main(String[] args) {
        // break statement
        /*
        for (int i=0;i<=3;i++) {
            if (i == 2) {
                System.out.println(i);
                System.out.println("i am nihal");
                break;
            }
        }

         */

        // continue statement
        for (int i=0;i<5;i++){
            if (i==2){
                System.out.println("ending the loop");
                continue;
            }
            System.out.println(i);
        }
    }
}
