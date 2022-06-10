package com.anmol;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        sort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    static void sort(int[] nums, int low, int high){
        if(low >= high){
            return;
        }

        int s = low, e = high;

        int m = s + (e-s)/2;
        int pivot = nums[m];

        while (s <= e){

            // also a reason why if its already sorted it will not swap (unlike ms)
            while (nums[s] < pivot){
                s++;
            }

            while (nums[e] > pivot){
                e--;
            }

            // swap at violation condn
            if(s<=e){
                int t = nums[s];
                nums[s] = nums[e];
                nums[e] = t;
                s++;
                e--;
            }
        }


        // now pivot at correct index, sort the two halves
        sort(nums, low, e);
        sort(nums, s, high);
    }
}
