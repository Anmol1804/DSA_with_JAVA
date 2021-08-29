package com.anmol;

public class Shadowing {
    static int x=90; // this will shadow at line 8
    public static void main(String[] args) {
        System.out.println(x); // 90

        // shadowing begins after declaring local var
        int x; //declare

//        System.out.println(x); => throw error as no value

        x=40;  //initialize
        System.out.println(x); // 40
        fun();      // 90
    }
    static void fun(){
        System.out.println(x);
    }
}
