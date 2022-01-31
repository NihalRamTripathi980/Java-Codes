package com.company;

import java.util.Scanner;
class MyException3 extends Exception{
    public  String toString (){
        return "error1";
    }
}
public class CWH_86_ps {
    public static int Error(int i) throws MyException3 {
        if (i > 5) {
            throw new MyException3();

        }
        return 1;
    }

    public static void main(String[] args) {
        // problem 1
        //   int a= 5   Syntax error
        // int age = 56;
        // int year_of-born = 2000 - 56;  // this is logical error because of formula is wrong
        /*
        int a= 5;
        int b= 0;
        int c= a/b;
        System.out.println(c);
        // run time error
         */
        // Problem 2
        try {
            int a = 6666 / 0;
        } catch (ArithmeticException e) {
            System.out.println("haha");
        } catch (IllegalArgumentException e) {
            System.out.println("hehe");
        }
        // Problem n0 3
        int[] marks = new int[3];
        marks[0] = 32;
        marks[1] = 44;
        marks[2] = 56;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int index;
        int i = 0;
        while (flag && i <= 5) {

            try {
                System.out.println("enter you index");
                index = sc.nextByte();
                System.out.println("your indexed value is :" + marks[index]);
                break;
            } catch (Exception e) {
                System.out.println(" invalid error ");
                i++;
            }
        }
        if (i >= 5) {
            try {
                throw new MyException3();
            } catch (Exception e) {
                System.out.println(e.toString());
            }

        }
        try {
            int e = Error(i);

        } catch (MyException3 myException3) {
            System.out.println("error");
        }
    }
}
