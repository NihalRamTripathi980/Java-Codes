package com.company;

public class CWH_27_arrays {
    public static void main(String[] args) {
        int []marks={24,36,57,87,34};
   //     float []marks={24.5f,23.5f,25.4f,23.5f};
    //    String [] student={"harry","Nihal","sunil"};
    //   //  System.out.println(marks[2]);
    //     System.out.println(marks.length); // For getting length
    //     System.out.println(student.length);

        // Displaying An Array Using FOR Loop
      //  for (int i=0;i<marks.length;i++){
        //    System.out.println(marks[i]);
       // }

        // Quick Quiz Displaying in reverse order
        for (int i=marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }
      // method2
        System.out.println("Printing using foe each loop");
        for (int element:marks){
            System.out.println(element);
        }

    }
}
