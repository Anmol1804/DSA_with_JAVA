package com.anmol;

public class fibonacciRecursion {
    public static void main(String[] args) {
        // nth fibo number
        int ans = fib(4);
        System.out.println(ans);
    }

    static int fib(int n){
        // base condn
        if(n<2){
            return n;
        }

        return (fib(n-1) + fib(n-2));
    }
}
