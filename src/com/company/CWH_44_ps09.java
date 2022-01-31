package com.company;
class sphere{
    public sphere(int radius){
      this.radius=radius;
    }
    private int radius;
    public double surfaceArea(){
        return 4*Math.PI*radius*radius;
    }
    public double volume(){
        return (4/3)*Math.PI*radius*radius*radius;
    }
}
class Rectangle{
    private int length;
    private int breath;

    public Rectangle(int length, int breath) {
        this.length = length;
        this.breath = breath;
    }

    public Rectangle() {
        this.length = 4;
        this.breath = 5;
    }

    public int getLength() {
        return length;
    }

    public int getBreath() {
        return breath;
    }
}


class cylinder{
    private  int r;
    private  int h;

    public cylinder(int r, int h) {
        this.r = r;
        this.h = h;
    }

    public cylinder() {
    }

    public cylinder(int h) {
        this.h = h;
    }

    public float surfaceArea(){
        return (2*3.142f*r*h) + (2*3.142f*r*r);
    }
    public double volume(){
        return Math.PI*r*r*h;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }




    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
}

public class CWH_44_ps09 {
    public static void main(String[] args) {

        // problem 1
/*
        cylinder myC = new cylinder(9,12);

       //myC.setH(12);
     //   System.out.println(myC.getH());
      //  myC.setR(9);
     //   System.out.println(myC.getR());



        // Problem 2
        System.out.println(myC.surfaceArea());
        System.out.println(myC.volume());


        // Problem 3
        done
 */
        // problem 4
        Rectangle r= new Rectangle();
        System.out.println(r.getBreath());
        System.out.println(r.getLength());
      // problem 5
        sphere sp= new sphere(2);
        System.out.println(sp.surfaceArea());
        System.out.println(sp.volume());
    }
}
