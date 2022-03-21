package com.anmol;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3,1,2,5,4};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){
        boolean swapped;
        // run steps n-1 steps
        for(int i=0; i< arr.length; i++){
            swapped = false;
            // for each step, max will come to last respective position
            for(int j=1; j< arr.length-i; j++){
                // swap if item smaller than previous item
                if (arr[j]< arr[j-1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                    swapped = true;
                }
            }

            // if not swapped for any particular value of i => array is sorted
            if(!swapped){
                break;
            }
        }
    }
}
