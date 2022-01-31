package com.company;

public class CWH_28_multi_dim_arrays {
    public static void main(String[] args) {
        //   int [] marks ;// 1-D Array
        int[][] flats; // 2-D Array
        flats = new int[2][3];
        flats[0][0] = 100;
        flats[0][1] = 101;
        flats[0][2] = 102;
        flats[1][0] = 203;
        flats[1][1] = 204;
        flats[1][2] = 205;
        System.out.println("Displaying 2-D Arrays");

        //  System.out.print("\n");
        for (int i =0; i<flats.length; i++) {
            for (int j = 0; j<flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
