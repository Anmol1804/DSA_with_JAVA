package com.anmol;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4,5};
        selection(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            // find max in remaining array and swap with correct
            int last = arr.length - i -1;

            // element at max index
            int maxIndex = getMaxIndex(arr, 0, last);

            swap(arr, maxIndex, last);

        }
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = 0; i <= end; i++) {
            // swapping
            if(arr[max] < arr[i]){
                max = i;
            }
        }

        return max;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
