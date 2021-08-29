package com.anmol;

public class FunctionOverloading {

    public static void main(String[] args) {
        func(18);
        func("Anmol");
        // func(); => error can't be empty
    }

    static void func(int a){
        System.out.println(a);
    }

    static void func(String b){
        System.out.println(b);
    }

}
