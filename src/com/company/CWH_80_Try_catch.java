package com.company;

public class CWH_80_Try_catch {
    public static void main(String[] args) {
        int a= 200;
        int b=0;
        try {
            int c= a/b;
            System.out.println("The result is :"+ c);
        }
        catch (Exception e){
            System.out.println("sorry something is wrong");
            System.out.println(e);
        }

    }
}
