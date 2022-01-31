package com.company;

public class CWH_29_Practice_Set_6 {
    public static void main(String[] args) {

        // Practice Problem 1
        /*

        float[] sums ={2.5f,2.5f,3.5f,3.5f,1.0f};
        float sum=0;

     //   for (float element:sums){         // Method 1 to add
      //      sum=sum+element;
      //  }
     //   System.out.println(sum);



        // Method 2 for add

        for (int i=0;i<sums.length;i++){
            sum = sum+sums[i];
        }
        System.out.println(sum);

         */


        // Practice Problem 2
        /*
        float[] marks ={2.5f,2.5f,3.5f,45.7f,1.0f};
        float num =45.7f;
        boolean isInArray=false;
        for (float element:marks){
            if (element==num){
                isInArray=true;
                break;
            }
        }
        if (isInArray){
            System.out.println("is present in array");
        }
        else
        {
            System.out.println("not present in array");
        }

         */

        // Practice Problem 3
        /*
        float[] marks ={2.5f,2.5f,3.5f,3.5f,1.0f};
        float sum=0;
        for (float element:marks){
            sum=sum+element;
        }
        System.out.println("The Average value is\n " +sum/marks.length);

         */

        // Practice Problem 4
        /*
        int[][] mat1={ {2,45,46},
                        {3,4,65} };
        int [][]mat2={  {43,25,71},
                        {34,65,78} };
        int [][] result={{0,0,0},
                          {0,0,0} };

        for (int i=0;i<mat1.length;i++) {
            for (int j=0;j<mat1[i].length;j++){      // row no. of time
                result[i][j]=mat1[i][j]+ mat2[i][j];  // column no. of time
                System.out.print(result[i][j] + "  ");
            }
            System.out.println(" ");
        }

         */

        // Practice Problem 5
        // Method 1
        /*
        int [] arr={23,43,34,65,34,3};
        System.out.println("Array in reverse order");
        for (int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }


        // Method 2
        int[] arr = {1, 2, 3, 4, 5, 6};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;
        for (int i = 0; i < n; i++) {
            temp = arr[i];
            arr[i] = arr[l - 1 - i];
            arr[l - 1 - i] = temp;
        }
        for (int element : arr) {
            System.out.println(element);
        }



        // Practice Problem 6

        int[] arr = {23, 43, 34, 65, 34, 3};
        int max=0;
        for (int element:arr){
            if (element>max){
                max=element;
            }
        }
        System.out.println(max);
        // Practice Problem 7
        int min=Integer.MAX_VALUE;
        for (int element:arr){
            if (element<min){
                min=element;
            }
        }
           System.out.println("MINIMUM value is   "+ min);


         */
        // Practice Problem 8
        boolean isSorted=true;
        int [] arr={23,43,34,65,34,3};
        for (int i=0;i<arr.length-1;i++){
            if (arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }
        if (isSorted){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Unsorted");
        }
    }
}
