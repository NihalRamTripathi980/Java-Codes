package com.company;

public class CWH_17_Logical {
    public static void main(String[] args) {
        boolean a = true;   // For   Logical  "AND"
        boolean b = false;
        if (a && b){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        boolean a1= true;   // For Logical "OR"
        boolean b1 =false;
        if (a1 || b1) {
            System.out.println("yes");
        }
        else{
            System.out.println("No");
            }

        // For Logical "NOT"

        System.out.println("for NOT a is ");
        System.out.println(!a);
        System.out.println("for NOT b is ");
        System.out.println(!b);

    }
}
