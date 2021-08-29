package com.anmol;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        // create an array
        int[] arr = {1,2,3,4,5,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums){
        // if we change obj. via this ref variable
        // same obj will be changed
        nums[0] = 99;

    }
}
