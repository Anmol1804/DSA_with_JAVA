package com.anmol;

public class Prime  {
    public static void main(String[] args) {
        int n =10;
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + isPrime(i));
        }
//        System.out.println(isPrime(n));
    }

    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }

        int c=2;

        // or c<sqrt(N)
        while(c*c <= n){
            if(n%c == 0){
                return false;
            }

            c++;
        }

        return true;
    }
}
