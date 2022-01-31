package com.company;

import javax.swing.text.ChangedCharSetException;

// problem 6 & 7
interface TVRemote{
void switchOFF();
void volumeUP();
void volumeDoWN();
}
interface SmartTvRemote extends TVRemote{
    void Zoom();
    void ChannelChange();

}
class Tv implements TVRemote{
   public void switchOFF(){
        System.out.println("switch off the tv");
    }
   public void volumeUP(){
        System.out.println("volume up");
    }
   public void volumeDoWN(){
        System.out.println("volume down");
    }

}
// problem 3
interface BasicAnimal{
    void eat();
    void sleep();
}
class Monkey{
    void jump(){
        System.out.println("we can jump");
    }
    void bite(){
        System.out.println("we can also able to Bite");
    }

}
class
 human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("eating ");
    }
    public void sleep(){
        System.out.println(" sleeping");
    }
}
// Problem 1 & 2
 abstract class pen{
    abstract void write();
    abstract void  refill();
}
class FountainPen extends pen{
    void write(){
       System.out.println("write");
    }
     void  refill(){
        System.out.println("refill");
    }
    void changeNib(){
        System.out.println("changing Nib");
    }
}
public class CWH_60_ps11 {
    public static void main(String[] args) {
        // problem 1 & 2
        /*
        FountainPen fp= new FountainPen();
        fp.write();
        fp.changeNib();

         */
        // Problem 3
       human h= new human();
       h.eat();
       h.bite();h.jump();
       // problem 5 using 3
        BasicAnimal b = new human();
        b.eat();            // we can only use basic animal methods because of polymorphism
        b.sleep();
        // problem 6 & 7
        Tv t = new Tv();
        t.switchOFF();
    }
}
