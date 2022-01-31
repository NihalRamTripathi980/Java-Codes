package com.company;

public class CWH_34_Recursion {
    static int factorial_iterative(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int product=1;
            for (int i = 1; i <= n; i++) {

                product *= i;
            }
          return  product;
        }

    }



    static int factorial(int n){
        if (n==0|| n==1){
            return  1;
        }
        else{
            return n* factorial(n-1);
        }
    }
    public static void main(String[] args) {
        int  n=4,n1=3;
        System.out.println("The Factorial n ="+ n +" is :" +factorial(n));
        System.out.println("the Factorial of n is:" +factorial_iterative(n1));


    }
}
