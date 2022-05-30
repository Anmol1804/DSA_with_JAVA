package com.anmol;

public class ProductOfDigits {
    public static void main(String[] args) {
        System.out.println(digitProduct(12345));
    }

    static int digitProduct(int n){
        if(n==0){
            return 1;
        }

        return (n%10 * digitProduct(n/10));
    }
}
