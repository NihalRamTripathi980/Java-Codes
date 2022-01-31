package com.company;
import java.util.Scanner;
public class CWH_18_elseif {
    public static void main(String[] args) {


        System.out.println("Enter your Age");
        Scanner agesc = new Scanner(System.in);
        int age = agesc.nextInt();
/*
        if (age>56){
            System.out.println("You are experienced");
        }
        else if (age>46){
            System.out.println("You are Semi- experienced");
        }
        else if (age>36){
            System.out.println("You are Semi Semi -experienced");
        }
        else{
            System.out.println("you are Unexperienced");
        }

         */
        switch (age ){
            case 18:
                System.out.println("You are going 34to adult");
                break;
            case 21:
                System.out.println("You are goint to do job");
                break;
            case 60:
                System.out.println("you are to retired");
                break;
            default:
                System.out.println("enjoy your life");

        }
        String var = "nihal";
        switch (var){
            case"nihal"-> {
                System.out.println("nice nihal sir");
                System.out.println("good job");
            }
            case "vishal"-> System.out.println("no man bro dont worry");


        }
    }

}
