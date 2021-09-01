package com.anmol;

import java.util.Arrays;

public class ReversedArray {
    public static void main(String[] args) {
        // this is 2 pointer method one at start and one at end
        int[] arr = {1,2,3,4,5, 6};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    //swap 1 and last, 2 and last-1, ....
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
