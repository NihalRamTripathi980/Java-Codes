package com.company;
class MyThd1 extends Thread{
    public MyThd1(String name) {
        super( name);
      //  System.out.println("Thank you ");

    }
    public void run() {
        int i = 34;
        while (i <= 40) {
            System.out.println("This is my Thread " + this.getName());
           // System.out.println("This is my Thread ");
            i++;
        }
    }
}
public class CWH_74_thread_priorities {
    public static void main(String[] args) {
        MyThd1 t1= new MyThd1("Mahesh1");
        MyThd1 t2= new MyThd1("Mahesh2");
        MyThd1 t3= new MyThd1("Mahesh3");
        MyThd1 t4= new MyThd1("Mahesh4");
        MyThd1 t5= new MyThd1("Mahesh5");
        MyThd1 t6= new MyThd1("Mahesh6( Most Important)");
        t6.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}
