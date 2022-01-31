package com.company.CWH_exercise6;

import java.util.Scanner;

// video 87

 class InvalidInputException extends Exception {
    public String toString() {
        return "Invalid Input";
    }
}
    class  MaxInputexception extends Exception{
        public String toString(){
            return "Error -- You entered the max value";
        }
 }



public class CWH_exercise6 {
     public  static void  add( int a,int b) throws MaxInputexception {

         if (a>10000 || b>10000){
             throw  new MaxInputexception();
         }
         else {
           int   r= a+b;
             System.out.println("your addition value is :" + r);
         }



     }
    public  static void  mul( int a,int b) throws MaxInputexception {

        if (a > 7000 || b > 7000) {
            throw new MaxInputexception();
        } else {
            int r = a * b;
            System.out.println("your multiplication value is : " + r);
        }

    }
    public  static void  divide( int a,int b) throws ArithmeticException {

        if (a<=0 && b<=0) {
            throw new ArithmeticException("you entered zero plzz change it");
        } else {
            int r = a /b;
            System.out.println("your division value is : " + r);
        }
    }
    public  static void  substract( int a,int b) throws InvalidInputException{

     if (a>=10000|| b>=10000) {
        throw new InvalidInputException();
    } else {
        int r = a - b;
        System.out.println("your substraction value is : " + r);
    }
}

        public static void main(String[] args) {
         boolean flag = true;
         int i=0;
         while (flag && i<5) {
             System.out.println("enter your values");
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter the first value ");
             int a = sc.nextInt();
             System.out.println("enter the second value");
             int b = sc.nextInt();
             try {
                 add(a, b);
             } catch (Exception e) {
                 System.out.println(e.toString());
                 i++;
             }
             try {
                 mul(a, b);
             } catch (Exception e) {
                 System.out.println(e.toString());
                 i++;
             }
             try {
                 divide(a, b);
             } catch (Exception e) {
                 System.out.println(e.toString());
                 i++;
             }
             try {
                 substract(a, b);
             } catch (Exception e) {
                 System.out.println(e.toString());
                 i++;
             }
         }
    }
}
