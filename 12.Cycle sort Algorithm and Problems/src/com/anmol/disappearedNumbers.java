package com.anmol;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// Google ques

public class disappearedNumbers {
    public static void main(String[] args) {

        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }

    static List<Integer> findDisappearedNumbers(int[] arr) {

        int i=0;
        while (i< arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else {
                i++;
            }
        }

        List<Integer> output = new ArrayList<>();

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j+1){
                output.add(j+1);
            }
        }

        return output;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
