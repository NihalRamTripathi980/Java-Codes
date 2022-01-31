package com.company;

public class CWH_85_finally {
    public static int greet(){
        try{
            int a= 20;
            int b= 6;
            int c= a/b;
            System.out.println(c);
            return c;
        }
        catch (Exception e){
            System.out.println(e);
            System.out.println("exception in greet function ");
        }
        //System.out.println("I am Nihal");
        finally {             // The program written in finally block is always executed
            System.out.println("I am NIhal ");
        }
        return -1;
    }
    public static void main(String[] args) {

        int a = 10;
        int b = 2;
        while (true) {
            try {
                int d = a / b;
                System.out.println(d);
                break;
            } catch (Exception e) {
                System.out.println(e);
            }

            finally{
                System.out.println("I am Finally");

            }
            b--;
        }
        try{
            System.out.println("try with finally");
        }
        finally {
            System.out.println("thank you");
        }
    }
}
