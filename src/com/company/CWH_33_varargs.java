package com.company;

public class    CWH_33_varargs {
    static int sum(int ...arr){
        // Available int[]arr
        int result=0;
        for (int a:arr){
            result+=a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("welcome to Varargs  Tutorials ");
        System.out.println("The sum of 4 & 5 is :"+ sum(4,5));
        System.out.println("The sum of 5,6 ,7 8,&9:"+ sum(5,6,7,8,9));


    }
}
