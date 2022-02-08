package com.company;

@FunctionalInterface  // FunctionalInterface is a interface which has only one interface
interface DemoAno{
    void meth1();

}
//class AnonyDemo implements DemoAno{
//    public void display(){
//        System.out.println("Hello");
//    }
//
//    @Override
//    public void meth1() {
//        System.out.println("I am meth 1");
//
//    }
//
//    @Override
//    public void meth2() {
//        System.out.println("I am meth 2"
//        );
//
//    }
//}
public class CWH_109_lambda {

    public static void main(String[] args) {

//      DemoAno an = new AnonyDemo();
//      an.meth1();

        // Anonymous Class
    DemoAno obj = new DemoAno() {
        @Override
        public void meth1() {
            System.out.println("I am also method 1");
        }


    };
    obj.meth1();

    // Lambda Expressions  , It is used when a interface is a functionalInterface which means it has only one method in the interface
        DemoAno obj1 =()->{
            System.out.println("I am meth 1");
        };
        obj1.meth1();
    }
}
