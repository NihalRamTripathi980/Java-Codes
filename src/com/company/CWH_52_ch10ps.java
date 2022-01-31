package com.company;
class Rectangle1{
  public   int length;
  public  int breath;
  Rectangle1(){
      System.out.println("I am Rectangle's Constructor & Non Parameterized");

  }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreath() {
        return breath;
    }

    public  void setBreath(int breath) {
        this.breath = breath;
        //return breath;
    }

    public float area(){
      return length*breath;
  }

}
class rectangular_prism extends Rectangle1{
    rectangular_prism(){
        System.out.println(" I am rectangular Prism in construtor");
    }
    public int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public float area_prism() {
        return 2*breath*length+ 2*length*height+2*height*breath;
    }
}
class circle{
    public int radius;
     public circle(){
        System.out.println("I am non param circle");
    }
    public circle(int r){
        System.out.println(" I am Circle parameterized  constructor");
       this.radius= r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder extends circle {
    public int height;
     public Cylinder(int r, int h){
        super(r);
         System.out.println(" I am parameterized constructor");
         this.height=h;
    }


    public double volume() {
        return Math.PI * this.radius * this.radius * height;
    }
}
public class CWH_52_ch10ps {
    public static void main(String[] args) {
        // Problem 1
       // circle c = new circle(2);
        Cylinder cy= new Cylinder(4,5);

        //c.area();
        System.out.println(cy.area());
        System.out.println(cy.volume());
        Rectangle1 r1 = new Rectangle1();
        rectangular_prism p = new rectangular_prism();
        p.setBreath(2);
        p.setLength(3);
        p.setHeight(4);
        System.out.println("area of rectangle " + p.area());
        System.out.println(" area of rengular prism :" + p.area_prism());
    }
}
