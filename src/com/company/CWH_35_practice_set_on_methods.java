package com.company;

import java.util.Scanner;

public class CWH_35_practice_set_on_methods {
    static  float faren(float n){
       float  cel;
        cel=(n- 32)*5/9;
      return  cel;
    }




    static void pattern1_rec(int n){
        if (n>=1){
            pattern1_rec( n-1);
            for (int i=1;i<=n;i++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
    static int avg(int ...arr){
        int num=0;
        int average;
    for (int element:arr){
        num+=element;
    }
    average=num/arr.length;
    return average;



    }
    static  int fib(int n){
        if (n==1){
            return 0;
        }
        else if (n==2){
            return 1;
        }
        else{
            return fib(n-1)+fib(n-2);
        }

    }
    static void pattern2(int n){
        for (int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    static int recursive_sum(int n){
       // int sum=0;
      //  for (int i=1;i<=10;i++){
        // sum+=i;
   if (n==1){
    return 1;
   }
       // }
        return n +recursive_sum(n-1);
    }
    static void pattern1(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // problem no. 1
    static void mul( int n) {
        for(int i =1;i<=10;i++){
            System.out.format("%d x %d=%d\n" ,n,i, n*i);
        }
    }
        public static void main(String[] args) {
       // System.out.print("Enter the number which you want to table form");
      //  int num=2;

          //  Scanner sc=new Scanner(System.in);
           // int num= sc.nextByte();
          //  System.out.print("Enter the number which you want to table form");
           // mul(num);

            // problem no. 2
           // int n=4;
         //   pattern1(n);

//           int n=3;
           // System.out.println(recursive_sum(n));

            // Problem no. 4

            //  int n=4;
            //  pattern2(n);

            // problem no 5
            // fibonacci  series  0 1 1 2 3 5 8 13
             // System.out.println(fib(7));

            // problem no 6
          //    int result= avg(1,2,3,4,5);
             //  System.out.println(result);

            // Problem no 7
            //pattern1_rec(4);

            // problem no. 8
            System.out.println(faren(24));

    }
}
