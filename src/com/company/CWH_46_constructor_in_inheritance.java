package com.company;

class Base {
int x;
  public   Base()
  {
        System.out.println(" I am a base class Constructor");
    }
    public Base(int x)  {

        System.out.println("I am a base constructor using x value" + x);
    }
}
  class derived extends Base{
     int y;
    public   derived() {
     //   super(3);
          System.out.println("I am a derired class constructor");
      }
      derived(int x,int y){
        super(x);
          System.out.println(" I am a derived class constructor using x & y"+ y);
      }
  }
  class childOfDerived extends derived{
    childOfDerived(){
        System.out.println(" I am child of derived constructor ");
    }
    childOfDerived(int x,int y,int z){
        super(x,y);
        System.out.println("I am child of derived constructors using x , y ,z"+ z);
    }

  }


public class CWH_46_constructor_in_inheritance {
    public static void main(String[] args) {

       // Base b = new Base();
      //  derived d = new derived(14,34);
childOfDerived cd = new childOfDerived(1,2,3);
    }
}