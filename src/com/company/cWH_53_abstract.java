package com.company;
 abstract class Parent{
    public void SayHello(){
        System.out.println(" Hello sir !");
    }
   public abstract void greet();
}
class child1 extends Parent{
     public  void greet(){
         System.out.println("hello Good morning");
     }
}
 abstract class child2 extends Parent{
     public void wish(){
         System.out.println("Good evening");
     }
}
public class cWH_53_abstract {
    public static void main(String[] args) {

    }
}
