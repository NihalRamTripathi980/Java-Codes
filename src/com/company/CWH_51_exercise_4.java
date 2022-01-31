package com.company;

import java.util.Scanner;
class Library{
    int addedBook;
    int book;
    String[] availableBooks= new String[50];
    Library (){
        System.out.println("Here You can find out Library Details");

    }
    public void ReturnBook(){
        AddBook("Data Science");
        System.out.println("Your  Book is returned");
    }
        public void AddBook ( String n) {
            for (int i =0;i <= availableBooks.length;i++){
                if (availableBooks [i]== null){
    availableBooks[i]= n;
                    System.out.println(" Book Added Successfully");
                    break;
                }
            }
        }

        public void issueBook (String book) {
        for (int i = 0;i<=availableBooks.length;i++){
            if (availableBooks[i].equals((book))){
                System.out.println("The book has been issued ! Successfully");
               this.availableBooks[i] = null;
               return;
            }
        }
            System.out.println("This book does not exist");
       }
        public void  showAvailableBooks() {
            System.out.println("The Books that are available in the available are :  ");
            for (String element : availableBooks) {
                if (element == null) {
                    continue;
                }
                System.out.println(element + " ");
            }
        }


}

public class CWH_51_exercise_4 {
    public static void main(String[] args) {
Library library = new Library();
        System.out.println(" Enter 1 for add books * \n Enter 2 for show available book* \n Enter 3 for Issue Books \n Enter 4 for Return Book  \n Enter 5 for Exit from the Library");
        Scanner sc = new Scanner(System.in);
        while(true) {
            int user = sc.nextInt();
            if (user == 1) {
                library.AddBook("Math");
                library.AddBook("Data Science");
                library.AddBook("Android Development Book By NRT ");
            } else if (user == 2) {
                library.showAvailableBooks();
            } else if (user == 5) {
                System.out.println(" THANKS for using Library");
                break;
            }
            else if (user == 3){
                library.issueBook("Data Science");
            }
            else if (user == 4){
                library.ReturnBook();
            }

        }
        // video number 61 solution Also
    }
}
