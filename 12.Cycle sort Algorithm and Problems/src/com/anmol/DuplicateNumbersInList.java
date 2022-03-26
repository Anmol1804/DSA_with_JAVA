package com.anmol;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-all-duplicates-in-an-array/
// Microsoft Question

public class DuplicateNumbersInList {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        System.out.println(findDuplicates(arr));
    }
    static List<Integer> findDuplicates(int[] arr){
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
                output.add(arr[j]);
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
