package com.anmol;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        // int[][]arr = new int[][]{..}  => we can write this also but it's not mandatory
        int[][] arr ={
                {1,34,23},
                {34,16,15,11},
                {5,4,2},
                {234,456}
        };

        int target = 11;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {

                    // to return array we must create a obj
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
