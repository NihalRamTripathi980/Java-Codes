package com.company;
class MyNegativeException extends Exception{
    public String  toString(){
        return "I am ToString" + "Invalid";
    }
    public String getMessage(){
        return "I am getMessage"+ "Invalid age";
    }
}
public class CWH_84_throw_throws {
    public static  double area(int r) throws MyNegativeException{
        if (r<0){
            throw new MyNegativeException();
        }
        double result= Math.PI*r*r;
        return result;

    }
    public static int divide(int a,int b) throws ArithmeticException {
        int result= a/b;
        return result;
    }
    public static void main(String[] args) {
        // using divide function
        try {
            int c = divide(-1, 0);
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println("exception in divide");
        }
        try {
            double ar = area(-1);
            System.out.println(ar);
        }
        catch (Exception e){
            System.out.println("Exception");

        }
    }
}
