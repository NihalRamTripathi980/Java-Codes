package com.company;
interface Bicycle{
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    void blowHornKGF();
    void blowHornScam();
}
class AvonCycle implements Bicycle,HornBicycle{
    int speed = 7;
  public   void applyBrake(int decrement){
        speed = speed - decrement;
      System.out.println(" applying Brake....");
      System.out.println(speed);
    }
    public void speedUp(int increment) {
        speed = speed + increment;
        System.out.println("SpeedUP....");
        System.out.println(speed);
  }
  public void blowHornKGF(){
      System.out.println("Blowing horn KGF..");
  }
  public void blowHornScam(){
      System.out.println("Blowing horn Scam1995....");
  }

}

public class CWH_54_Interfaces {
    public static void main(String[] args) {
      AvonCycle av = new AvonCycle();
      av.applyBrake(3);
 av.speedUp(3);
 av.blowHornKGF();
 av.blowHornScam();
    }
}
