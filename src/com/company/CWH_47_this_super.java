package com.company;
class ekClass{
    int a;
ekClass(int a){
   this.a=a;
}
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
class DoClass extends ekClass{
    DoClass(int c){
        super(c);
        System.out.println(" I am doClass constructor");
    }
}
public class CWH_47_this_super {
    public static void main(String[] args) {
    ekClass e= new ekClass(5);
    DoClass d = new DoClass(7);
        System.out.println(e.getA());
    }
}
