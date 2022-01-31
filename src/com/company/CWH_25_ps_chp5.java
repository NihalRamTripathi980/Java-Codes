package com.company;

public class CWH_25_ps_chp5 {
    public static void main(String[] args) {

        // practice problem 1
        /*
        int n =4;
        for (int i=n;i>=1;i--){
            for (int j=1;j<=i;j++) {
                System.out.print("*");
           }
                System.out.print("\n");

        }

         */

        // Problem 2

        /*
        int n=4;
        int sum=0;
        for (int i=1;i<=n;i++){
            sum = sum + (2*i);

        }
        System.out.println(sum);

         */

        // Problem 3
        /*
        int n =5;
        for (int i =1;i<=10;i++){
            System.out.printf("%d * %d= %d \n",n,i,n*i);
        }

         */

        // Problem 4
        /*
        int n=5;
        for (int i = 10;i>=1;i--){
            System.out.printf("%d *%d =%d\n",n,i,n*i);
        }

         */

        // Problem 5
        /*


        int n = 5;
        int factorial = 1;
        for (int i =1;i<=n;i++){
            factorial *=i;
        }
        System.out.println(factorial);

         */

        // Problem 6
        /*
        int n = 5;
        int i = 1;
        int factorial= 1;
        while(i<=n){
            factorial *= i;
           i++;
        }
        System.out.println(factorial);

         */

        // problem 7



        // Problem 9
        // sum  of  table 8
        /*
        int n =8;
        int sum =0;
        for (int i =1;i<=10; i++){
            sum +=n*i;
          //  System.out.printf("%d %d =%d \n",n,i,n*i);
        }
        System.out.println(sum);

         */

        // Problem 11
        /*

        int i=0;
        int sum = 0;
        int n=4;
        while(i<=n){
            sum +=2*i;
            i++;

        }
        System.out.println(sum);

         */

        // My practise
        /*

        int n =4;
        for (int i=1; i<=n;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.print("\n");
        }
        1
         */
       // problem

        int n =4;
        int i= 1;
        int j=1;
        while(i<=n){

            while (j <= i) {


                System.out.print("*");

               j++;
            }
            i++;
            System.out.print("\n");
        }



    }
}
