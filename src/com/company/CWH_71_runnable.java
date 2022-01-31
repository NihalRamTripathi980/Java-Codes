package com.company;
import javax.xml.namespace.QName;
import java.lang.Runnable;
import java.util.*;

class MyRunnableThread1 implements Runnable {
    // private final String name;
   // public Runnable r;
    public   MyRunnableThread1( int  r, String name){
        //super(name);
//this.name = name;
        System.out.println("Thank you");
        System.out.println(name);

    //  super(r);
  }
 public void run(){
     int i=0;
     while (i<=12){
         System.out.println("my runnable thread 1 ");
         i++;
     }
  }
}
class MyRunnableThread2 implements Runnable {
    public void run() {
        int i = 0;
        while (i <= 12) {
            System.out.println("my runnable thread 2");
            i++;
        }
    }
}

public class CWH_71_runnable {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
      //  int r=sc.nextInt();

        Runnable start;
        MyRunnableThread1 bullet1;
        bullet1 = new MyRunnableThread1(23 ,"Pankaj");
        Thread gun1 = new Thread(bullet1);
     MyRunnableThread2 bullet2 = new MyRunnableThread2();
    Thread gun2 = new Thread(bullet2);
    // gun1.start();
        System.out.println("My thread 1 name "+ gun1.getName());
        System.out.println("My thread 1 name "+ gun1.getId());

     //gun2.start();
    }
}
