package com.company;
 class Employee1 {
     int salary;
     String name;

     public int getSalary() {
         return salary;
     }

     public String getName() {
         return name;
     }
     public void  setName(String n){
         name=n;
     }
 }
 class Cellphone{
     public void ring() {
         System.out.println("Ringing ");
     }
         public void vibrate(){
             System.out.println("Vibrating");
        }
        public void callfriend(){
            System.out.println("Calling Nihal");
        }
 }
 class Square{
     int side;
     public int area(){
         return side*side;
     }
     public int perimeter(){
         return 4*side;
     }
 }
 class rectangle{
     int length;
     int breath;
     public int area(){
         return length*breath;
     }
     public int perimeter(){
         return 2*(length+breath);
     }
 }
 class tommy {
     public void hit() {
         System.out.println("Hitting the enemy");
     }

     public void run() {
         System.out.println("Running from the enemy");

     }

     public void fire() {
         System.out.println("Firing to the enemy");
     }
 }



         public class CWH_39_ch8ps {
    public static void main(String[] args) {

        // Problem 1
/*
        Employee1 nihal=new Employee1();
        nihal.salary=23;
        nihal.setName("NihalRamTripathi");
        System.out.println(nihal.getName());
        System.out.println(nihal.getSalary());


        // Problem 2
        Cellphone asus= new Cellphone();
        asus.callfriend();
        asus.ring();
        asus.vibrate();


        Square sq= new Square();
        sq.side=5;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
        rectangle rc=new rectangle();
        rc.length=2;
        rc.breath=3;
        System.out.println(rc.area());
        System.out.println(rc.perimeter());

 */
    tommy game= new tommy();
    game.run();
   game.fire();

    }
}
