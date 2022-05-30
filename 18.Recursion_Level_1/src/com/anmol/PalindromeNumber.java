package com.anmol;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(palindrome(12321));
    }

    static int reverseNum(int n){
        int d = (int)(Math.log10(n)) + 1;

        return helper(n,d);
    }

    private static int helper(int n, int d) {
        if(n%10 == n){
            return n;
        }
        int r = n%10;
        return (r* (int) (Math.pow(10, d-1))) + helper(n/10, d-1);
    }

    static boolean palindrome(int n){
        return (n == reverseNum(n));
    }
}
