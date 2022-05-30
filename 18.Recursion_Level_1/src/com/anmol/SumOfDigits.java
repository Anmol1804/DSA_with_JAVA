package com.anmol;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(digitSum(12345));
    }

    static int digitSum(int n){
        if(n==0){
            return 0;
        }

        return (n%10 + digitSum(n/10));
    }
}
