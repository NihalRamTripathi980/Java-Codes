package com.company;
class MyMainEmployee{
    public MyMainEmployee(){
     id=23;
        name ="Nihal ram Tripathi";

    }
     public  MyMainEmployee(String myname,int n){
         name = myname;
         id =n;
     }
  //   public MyMainEmployee(int n){
    //  id=n;
    // }
     public MyMainEmployee(int sa){
        salary= sa;
     }



    private   int id;
    private   String name;
    private int salary;
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
    public int  getSalary(){
        return salary;
    }

}
public class CWH_42_constructor {
    public static void main(String[] args) {
        MyMainEmployee nihal= new MyMainEmployee(100000);
       // nihal.setName("MYNIhAL");
        System.out.println(nihal.getName());
        System.out.println(nihal.getId());
        System.out.println(nihal.getSalary());
    }
}
