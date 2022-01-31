package com.company;
class Phone {
    public void greet(){
        System.out.println(" Good morning");
    }
    public void on(){
        System.out.println("Turning on Phone ");
    }
}
class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing Music");
    }
    public void on(){
        System.out.println("Turning On SmartPhone ");
    }
}
public class CWH_49_dynamic_method_dispatch {
    public static void main(String[] args) {
      // Phone obj = new Phone();  // Allowed
     //  SmartPhone obj1= new SmartPhone(); // Allowed
        Phone obj = new SmartPhone();

     //   SmartPhone obj1= new Phone(); // Not Allowed
        obj.greet();
        obj.on();
       // obj.music(); // Not Allowed
    }
}
