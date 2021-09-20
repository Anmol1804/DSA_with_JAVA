package com.anmol;

public class FloorOfNum {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        int ans = ceiling(arr, target);
        System.out.println(ans );
    }

    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(target < arr[0]){
                return -1;
            }

            if(arr[mid] == target){
                return mid;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }

        // if not found we return end
        return end;
    }
}
