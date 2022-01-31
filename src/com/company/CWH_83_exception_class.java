package com.company;

import java.util.Scanner;

class MyException extends Exception{
    public String  toString(){
        return "I am ToString" + "Invalid";
    }
    public String getMessage(){
        return "I am getMessage"+ "Invalid age";
    }
}
public class CWH_83_exception_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your Age");
        int age= sc.nextInt();
if (age>25) {
    try {
        throw new MyException();
    } catch (Exception e) {
        System.out.println(e.getStackTrace());
        System.out.println(e.toString());
        System.out.println(e.getMessage());
    }
}
    else{
    System.out.println("Your age is :"+ age);
        System.out.println("next step");
    }
}
    }

