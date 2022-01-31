package com.company;

import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        /*
        int temp=0;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Number for checking : ");
            int num = sc.nextByte();
            boolean flag = false;

            for (int i = 2; i <= num / 2; ++i) {
                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println(num + "  :: is not a prime number");
            } else {
                System.out.println(num + " : is  a prime number");
            }
            temp++;
        }while (true);

         */
             // Printing The prime number between 1 to Nth number





        // printing the star pattern
        /*
        int n = 7;
        for (int i=1;i<=n;i++){
         for (int j=1;j<=i;j++) {
             System.out.print("*");
         }
            System.out.print( "\n");
        }

         */
        int n=100;
        for (int i=2;i<=n;i++){
            boolean flag = false;

            int count =0;
            for (int j=2;j<=i;j++) {
                if (i % j == 0) {
                   // count++; OR
                    count = count + 1;// OR
                   // flag= true;
                 //  break;
                }
            }
            // if(!flag) // but it is not working why not resolve it
            if (count==1) {
                    System.out.println(" Prime Number is : " + i+ " ");
                }
                else{
                    count=0;
                    //flag = false;
            }
        }
    }
}
