package com.anmol;

// LeetCode prblm
// 1295. Find Numbers with Even Number of Digits

import java.util.Scanner;

public class EvenDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(findNumbers(arr));
    }

    static int findNumbers(int[] arr){
        int count = 0;
        for (int num : arr){
            if(checkEven(num)){
                count++;
            }
        }
        return count;
    }

    static boolean checkEven(int num){
        if(num<0){
            //log(-1) is undefined
            // making it positive
            num = num*-1;
        }
        if(num == 0){
            // log(0) is not defined
            // log(1) is 0
            num = 1;
        }

        //we can use while loop as well
        // there is direct formula
        return ((int)(Math.log10((num)) +1)%2 == 0);
    }
}
