package com.anmol;

public class SetBits {
    public static void main(String[] args) {
        int n=45;
        System.out.println(Integer.toBinaryString(n));

        System.out.println(setBits(n));
    }
    static int setBits(int n){
        int c=0;
//        while (n>0){
//            c++;
//            n -= (n & -n);
//        }

        while (n>0){
            c++;
            n = n&(n-1);
        }

        return c;
    }
}
