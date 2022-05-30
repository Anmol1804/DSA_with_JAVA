package com.anmol;

public class DigitsReverse {
    static int sum = 0;
    static void reverseNum1(int n){
        if(n==0){
            return;
        }

        int r = n%10;
        sum = sum*10 + r;
        reverseNum1(n/10);
    }

    static int reverseNum2(int n){
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


    public static void main(String[] args) {
//        reverseNum1(12345);
//        System.out.println(sum);
        System.out.println(reverseNum2(1234));
    }


}
