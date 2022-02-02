package com.company;

class CannotDivideByZeroException extends  Exception{

    public String toString(){
        return "Exception Divided By Zero";
    }
}
class MaxInputException extends Exception{
    public String toString(){
        return "Exception of Max Input Size";
    }
}
class MultiplyInputException extends Exception{
    public String toString(){
        return "Can't Multiple by 7000";
    }
}
class  InvalidInputException extends  Exception{

    private final String s;

    public  InvalidInputException(String s){
        this.s =s;
    }

    @Override
    public  String toString(){
        return  "Can't add 8 and 9";
    }
    public  String getMessage(){
        return "I am Message";
    }

}
class CustomCalculator {


  double add(double a, double b) throws InvalidInputException,MaxInputException {
      if(a>100000|| b>100000){
          throw new MaxInputException();
      }

      if(a==8|| b==9){
        throw new InvalidInputException("WE can't add 8 and 9");
        }
      return a+b;

  }
    double subtract(double a, double b)  throws MaxInputException {
        if(a>100000|| b>100000){
            throw new MaxInputException();
        }
        return a-b;

    }
    double multiply(double a, double b) throws MultiplyInputException ,MaxInputException{
        if(a>100000|| b>100000){
            throw new MaxInputException();
        }
      if (a==7000||b==7000){
          throw new MultiplyInputException();
      }
        return a*b;

    }
    double divide(double a, double b)  throws CannotDivideByZeroException ,MaxInputException {

        if(a>100000|| b>100000){
            throw new MaxInputException();
        }
        if (b==0) {
          throw new CannotDivideByZeroException();
      }
        return a/b;
    }

}

public class CWH_103_Exercise6_solustion {
    public static void main(String[] args) throws InvalidInputException, CannotDivideByZeroException,MultiplyInputException,MaxInputException {

        CustomCalculator c = new CustomCalculator();
       // System.out.println(c.add(6,9));
        System.out.println(c.divide(100,100000000));

    }
}
