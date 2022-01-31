package com.company;

public class CWH_32_method_overloading {
    static  void foo(){
        System.out.println("Good morning Bro");
    }
    static  void foo(int a){
        System.out.println("Good morning " + a +"Bro");
    }
   // static  void change(int []arr2){
   //     arr2[0]=46;
  //  }
    static void telljoke(){
        System.out.println("I invented a new Word! \n"+"Plagairism");

    }
    public static void main(String[] args) {
    //  telljoke();
        // Case 2 changing the array
      //  int [] arr={2,4,56,76,45,93};
     //   change(arr);
      //  System.out.println("Array after running "+ arr[0]);
        foo();
        foo(3000);  // argument are actual
    }
}
