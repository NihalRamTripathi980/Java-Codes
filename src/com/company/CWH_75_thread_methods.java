package com.company;
class MyThd2 extends Thread{

    public void run() {
        int i = 34;
        while (i <= 40) {
            System.out.println("THANK YOU 111 ** " + this.getName());
            try{
                Thread.sleep(4000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            i++;
        }
    }
}
class MyThd3 extends Thread{
    public void run(){
        int i = 34;
        while (i <= 40) {
            System.out.println("THANK YOU 222 ** " + this.getName());
            // System.out.println("This is my Thread ");
            i++;
        }
     }
    }


public class CWH_75_thread_methods {
    public static void main(String[] args) {
       MyThd2 t1 = new MyThd2();
       MyThd3 t2 = new MyThd3();
       t1.start();
       /*
      try{
        t1.join();
     }
      catch (Exception e){
         System.out.println(e);
      }

        */
       t2.start();
    }
}
