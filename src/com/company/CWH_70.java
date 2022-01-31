package com.company;
class MyThread1 extends Thread{
  public void run() {
      int i = 0;
      while (i <= 11) {
          System.out.println("MY cooking thread 1");
          System.out.println("I am happy ");
          i++;
      }
  }
}
class MyThread2 extends Thread{
    public void run(){
    int i=0;
    while (i<=12){
        System.out.println("my chatting thread 2 ");
        System.out.println(" I am Sad to her ");
        i++;
    }
    }
}
public class CWH_70 {
    public static void main(String[] args) {
       MyThread1 t1= new MyThread1();
       MyThread2 t2= new MyThread2();
       t1.start();
       t2.start();
    }
}
