package com.anmol;

public class MaximumItem {
    public static void main(String[] args) {
        int[] arr = {1,421,1231,414};
        System.out.println(max(arr));
    }

    static int max(int[] arr) {
        int maxval = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > maxval){
                maxval = arr[i];
            }
        }
        return maxval;
    }
}
