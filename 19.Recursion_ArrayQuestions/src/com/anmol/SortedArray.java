package com.anmol;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(sortedArr(arr, 0));
    }

    static boolean sortedArr(int[] arr, int i){
        if(i == arr.length - 1){
            return true;
        }

        return (arr[i] < arr[i+1]) && sortedArr(arr, ++i);
    }
}
