package com.company;

import java.util.ArrayList;

class Book{
   public String name ,author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
class Library_System{
    ArrayList<Book> books;
   public Library_System(ArrayList<Book> books){
       this.books=books;
   }
   public  void addBook(Book book){
       System.out.println("The Book is added to the Library");
       this.books.add(book);
   }
   public  void issueBook(Book book, String issued_to){
       System.out.println("The Book is issued from the Library to -"+issued_to);
       this.books.remove(book);
   }
   public void returnBook(Book book){
       System.out.println("This Book id return to the Library");
       this.books.add(book);
   }


}



public class Library_Management {
    public static void main(String[] args) {

        ArrayList<Book> bk = new ArrayList<>();
        Book b1 = new Book("DBMS1","Shubham");
        bk.add(b1);
        Book b2 = new Book("DBMS2","Shubham");
        bk.add(b2);
        Book b3 = new Book("DBMS3","Shubham");
        bk.add(b3);
//
        bk.add(new Book("Java","Harry"));
        bk.add(new Book("HTML","CodeWithHarry"));
       bk.add(new Book("CSS","Harry"));
        bk.add(new Book("C Programming","Vijendra"));
        Library_System l = new Library_System(bk);
        l.addBook(new Book("python ","Nihal"));
        l.issueBook(b2,"€nrtt");
        System.out.println(l.books);
       l.issueBook(new Book("Java","Harry"),"NRT");
      //  l.returnBook(new Book("Java","Harry"));
       // System.out.println(bk);
       // System.out.println(l.books);




    }
}
