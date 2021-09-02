package com.anmol;

public class SearchInRange {
    public static void main(String[] args) {

        int[] arr = {1,3,5,7,9,2,4};
        int target = 9;
        System.out.println(search(arr,target,1,5));
    }

    static int search(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }

        for (int i = start; i <=end; i++) {
            if(arr[i] == target){
                return i;
            }
        }

        return -1;
    }

}
