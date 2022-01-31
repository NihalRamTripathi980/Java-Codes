package com.company;

public class CWH_31_methods {
    static int logic(int x,int y){
        int z;
        if (x>y){
            z=x+y;
        }
        else{
            z=(x+y)*5;
        }
        return z;
    }

    public static void main(String[] args) {
        int a=2;
        int b=3;
        int c;
      //  CWH_31_methods obj= new CWH_31_methods();          // Method invocation using object creation
      //  c=obj.logic(a,b);
        c=logic(a,b);
        int a1=3;
        int b1=4;
        int c1;
       // c1=obj.logic(a1,b1);
        c1=logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);


    }
}
