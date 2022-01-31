package com.company;
class practice13 extends Thread{
  public  void run(){
        int i=0;
    while(i<=50){
        System.out.println("Good Morning ");
        i++;
      }
    }
}
class practice13b extends Thread {
    public void run() {
        int i = 0;
        while (i <= 50) {
            System.out.println("Welcome **** ");
            try{
                Thread.sleep(200);
            }
            catch (InterruptedException e){
               // e.printStackTrace();
                System.out.println(e);
            }
            i++;
        }
    }
}
public class CWH_76_practice13 {
    public static void main(String[] args) {
        practice13 p1= new practice13();
        practice13b p2= new practice13b();
        p1.start();
        p2.start();
       p1.setPriority(9);
        System.out.println(p2.getState());
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        System.out.println(p2.getState());
        System.out.println(Thread.currentThread().getState());

    }
}
