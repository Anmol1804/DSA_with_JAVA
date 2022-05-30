package com.anmol;

public class CountZeroes {
    public static void main(String[] args) {
        System.out.println(count(100201));
    }

    static int count(int n){
        return helper(n, 0);
         
    }

    private static int helper(int n, int c) {
        if(n==0){
            return c;
        }
        if(n%10 == 0){
            return helper(n/10, ++c);
        }

        return helper(n/10, c);
    }
}
