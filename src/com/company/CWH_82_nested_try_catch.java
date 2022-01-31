package com.company;

import java.util.Scanner;

public class CWH_82_nested_try_catch {
    public static void main(String[] args) {
        int [] marks= new int[3];
        marks[0]= 34;
        marks[1]= 46;
        marks[2]= 56;
        boolean flag= true;
        while (flag) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter index plzz");
        int ind = sc.nextInt();

            try {
                System.out.println("welcome in Level 1 ****");
                try {
                    System.out.println("indexed value is :" + marks[ind]);
                    flag= false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Array Index Out of Bound Exception /// Level 2 **** ");
                    System.out.println(e);
                }
            } catch (Exception e) {
                System.out.println("Something is wrong in level 1");
            }
        }
        System.out.println("Thank you");
    }
}
