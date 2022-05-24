package com.anmol;

//  AMAZON
public class MagicNumber {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(magic(n));
    }

    static int magic(int n){
        int ans = 0;
        int base = 5;
        while (n > 0){
            // last digit
             int lastd = n&1;
             n = n>>1;
             ans += lastd * base;
             base = base*5;
        }

        return ans;
    }
}
