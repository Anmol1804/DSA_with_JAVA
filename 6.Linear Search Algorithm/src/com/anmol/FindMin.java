package com.anmol;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {18,3,5,7,9,2,4};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int mini = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<mini){
                mini = arr[i];
            }
        }
        return mini;
    }
}
