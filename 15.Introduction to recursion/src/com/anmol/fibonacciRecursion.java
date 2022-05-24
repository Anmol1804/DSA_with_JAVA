package com.anmol;

public class fibonacciRecursion {
    public static void main(String[] args) {
        // nth fibo number
        int ans = fib(4);
        System.out.println(ans);

        for (int i = 0; i < 11; i++) {
            System.out.println(fibFormula(i));
        }

        System.out.println(fibFormula(50));
    }

//    fibo formula
    static int fibFormula(int n){
        return (int)((Math.pow((1+Math.sqrt(5))/2, n) - Math.pow((1-Math.sqrt(5))/2, n))/Math.sqrt(5));
    }

    static int fib(int n){
        // base condn
        if(n<2){
            return n;
        }

        return (fib(n-1) + fib(n-2));
    }
}
