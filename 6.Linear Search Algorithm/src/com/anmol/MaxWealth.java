package com.anmol;

// Leetcode problem
// 1672. Richest Customer Wealth
public class MaxWealth {
    //test case 1
    public static void main(String[] args) {
        int[][] account1 = {
                {1, 2, 3},
                {3, 2, 1}
        };
        System.out.println(maximumWealth(account1));

        // testcase 2
        int[][] account2 = {
                {1,5},
                {7,3},
                {3,5}
        };
        System.out.println(maximumWealth(account2));

        //testcase 3;
        int[][] account3 = {
                {2,8,7},
                {7,1,3},
                {1,9,5}
        };
        System.out.println(maximumWealth(account3));
    }

    static int maximumWealth(int[][] accounts){
        int max = 0;
        for (int[] paccount : accounts) {
            int sum = 0;
            for (int money : paccount) {
                sum = sum + money;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
