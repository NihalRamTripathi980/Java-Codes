package com.company;
class Cycle{

private float r;
public float getArea(){
     float a= 3.14f*r*r;
     return a;
 }
 public float getPerimeter(){
     float p=  2*3.14f*r;
     return p;
 }
    public void setArea(float n) {
        r = n;
        float a= 3.14f*r*r;
    }
    public void setPerimeter(float n1) {
     r=n1;
        float p = 2 * 3.14f * r;
    }
}
class MyEmployee{
  private   int id;
  private   String name;
  public String getName(){
      return name;
  }
  public void setName(String n){
      name=n;
  }
  public int getId(){
      return id;
  }
  public void setId(int n){
    id=n;
  }

}
public class CWH_40_ch9 {
    public static void main(String[] args) {
        MyEmployee nihal=new MyEmployee();
      //  nihal.id=25;
      //  nihal.name="Nihal Ram Tripathi";    // There an error due to access modifier


    //  nihal.setName("NihalRamTripathi");
     // nihal.setId(23);
     //   System.out.println(nihal.getName());
     //   System.out.println(nihal.getId());
Cycle c=new Cycle();
 c.setArea(2);
        System.out.println(c.getArea());
        c.setPerimeter(3);
        System.out.println(c.getPerimeter());
    }
}
