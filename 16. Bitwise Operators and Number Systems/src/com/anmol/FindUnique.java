package com.anmol;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,6,2,3,1};
        System.out.println(unq(arr));
    }

    static int unq(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans ^= arr[i];
        }

        return ans;
    }
}
