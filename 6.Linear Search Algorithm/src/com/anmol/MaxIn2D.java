package com.anmol;

public class MaxIn2D {
    public static void main(String[] args) {
        int[][] arr ={
                {1,34,23},
                {34,16,15,11},
                {5,4,2},
                {234,456}
        };

        System.out.println(max(arr));
    }
    static int max(int[][] arr) {
        int maxi = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (maxi < arr[row][col]) {
                    maxi = arr[row][col];
                }
            }
        }
        return maxi;
    }

}
