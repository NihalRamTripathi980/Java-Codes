package com.company;

import java.util.Scanner;

public class CWH_81 {
    public static void main(String[] args) {
        int [] marks= new int[3];
        marks[0]= 34;
        marks[1]= 46;
        marks[2]= 56;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array index");
        int ind = sc.nextInt();
        System.out.println("enter the number ypu want to divide with the value ");
        int number = sc.nextInt();
        try{
            System.out.println("the value of array index entered is : "+ marks[ind]);
            System.out.println("the value of array index - value / number  : "+ marks[ind]/number);
        }
        catch ( ArithmeticException e){
            System.out.println("Arithmetic Exception occurs ");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of box ");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("other Exception ");
            System.out.println(e);
        }
    }
}
