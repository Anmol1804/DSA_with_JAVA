package com.anmol;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         /*
             1 2 3
             4 5 6
             7 8

             int[][] arr = new int[3][];
             Rows are mandatory
             Cols are not mandatory

        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

          */

//        int[][] arr2d = {
//                {1,2,3}, // 0th index
//                {4,5,6,7}, //1st
//                {8,9,10}    //2nd..
//        };
//
//        System.out.println(Arrays.toString(arr2d[1]) + " " + arr2d[1][3]);

        // Input
        int[][] arrIn = new int[3][3];
        for (int row = 0; row < arrIn.length; row++) {
            for (int col = 0; col < arrIn[row].length; col++) {
                arrIn[row][col] = in.nextInt();

            }
        }

//        for (int row = 0; row < arrIn.length; row++) {
//            for (int col = 0; col < arrIn[row].length; col++) {
//                System.out.print(arrIn[row][col] + " ");
//            }
//            System.out.println();
//        }

      //  *****IMP here outer loop will have datatype of int*****
//        for (int[] ints : arrIn) {
//            for (int anInt : ints) {
//                System.out.print(anInt + " ");
//            }
//            System.out.println();
//        }

        for (int row = 0; row < arrIn.length; row++) {
            System.out.println(Arrays.toString(arrIn[row]));
        }



    }
}
