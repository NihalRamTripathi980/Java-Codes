package com.company;

import java.util.Random;
import java.util.Scanner;

public class CWH_20_rockScissorsPaper {
    public static void main(String[] args) {
        /*
        Random rd = new Random();
        int num = rd.nextInt(7);
        System.out.println(num);

         */
        System.out.println("Hello Guys Welcome to the fight  with computer");

        int r = 1;
        int s = 2;
        int p = 3;

        int i = 5;
        System.out.println( "Enter  1_Rock or 2_Scissor or 3_Rock  \\   Choose any number 1 or 2 or 3");
        Scanner sc = new Scanner(System.in);
        int choose = sc.nextInt();
        Random rd =   new Random();
        int computer = 1 +rd.nextInt(3);

        for (int u =0;u<=4;u++)

            if (choose == computer) {
                System.out.println("match tie");
            } else if ((choose == r && computer == s) || (choose == p && computer == r) || (choose == s && computer == p)) {
                System.out.println("You Won");
            } else {
                System.out.println("Computer won");
            }
        System.out.println("Computer was selected" + computer);

    }
}
