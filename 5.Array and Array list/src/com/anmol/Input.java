package com.anmol;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /* Array of primitives
        int[] arr = new int[5];

        // input using for loop
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        // printing
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Enahanced for loop
        // for every element print element
        // num represent element of array
        for (int num : arr) {
            System.out.print(num + " ");
        }


         */


        // Array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));

        // modify
        str[0] = "Anmol";
        System.out.println(Arrays.toString(str));





    }
}
