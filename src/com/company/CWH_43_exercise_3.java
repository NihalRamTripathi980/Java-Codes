package com.company;

import java.util.Random;
import java.util.Scanner;

class GuessTheNumber{
  private   int userInput;
  private int computerInput;
//  private int GuessTime=0;
    public GuessTheNumber(){
        System.out.println("Randam number is genrated between 1 to 10 ");
        Random rd= new Random();
         computerInput = 1+ rd.nextInt(10);
    }
    public void takeUserInput(){
        System.out.println("enter your guess number");
        Scanner sc = new Scanner(System.in);
         userInput= sc.nextByte();
        }
        public boolean isCorrect(){

        if( userInput==computerInput){
            return true;
        }
        else
            return false;
        }
        public int getNoOfGuess(){
          //  System.out.println("My guessed number is :"+userInput);
        return userInput;
        }
       public void setNoOfGuess(int n){
         userInput =n;
       }
       public int  getComputerInput() {
        return computerInput;
       }

}


public class CWH_43_exercise_3 {
    public static void main(String[] args) {
       int  GuessTime=0;
        /*
        Create a class game allows a user to play "Guess the Number"
        game once
         */
        int temp = 1;
        GuessTheNumber a = new GuessTheNumber();
    while(!a.isCorrect())     {
        GuessTime++;
            a.takeUserInput();
            if (a.isCorrect()) {
                System.out.println("Yes , you got right number :  " + a.getComputerInput());
                System.out.println(" Number Input by user : " + a.getNoOfGuess());
                System.out.println("You are trying " + GuessTime+" Attempts" );
            } else {
                System.out.println("NO, you didn't get right number ,Try Again");
            }
            if (a.getNoOfGuess() < a.getComputerInput()) {
                System.out.println("You entered a smaller number ");

            }
            else if (a.getComputerInput()== a.getNoOfGuess()) {
                System.out.println(" You entered equal number ");
            }
            else{
                System.out.println("You entered greater number");
            }
           // temp++;
           // a.setNoOfGuess(temp);
        }
    // Here I am using While loop instead of Do While loop ,So We can also use Do while loop for  better experience

    }
}
