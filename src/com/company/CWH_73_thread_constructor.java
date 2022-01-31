package com.company;
class MyThd extends Thread{
  public MyThd(String name) {
      super( name);
      System.out.println("Thank you ");

  }
  public void run() {
      int i = 34;
      while (i <= 40) {
          System.out.println("This is my Thread ");
          i++;
      }
  }
}
public class CWH_73_thread_constructor {
    public static void main(String[] args) {
     MyThd t1= new MyThd("Nihal");
     MyThd t2= new MyThd("Mahesh");
     t1.start();
     t2.start();
        System.out.println("My thread class Id is :" + t1.getId());
        System.out.println("My thread class name is :" + t1.getName());
        System.out.println("My thread class name is :" + t2.getName());
        System.out.println("My thread class name is :" + t2.getId());
    }
}
