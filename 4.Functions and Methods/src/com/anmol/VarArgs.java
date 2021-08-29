package com.anmol;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {

        fun(2,3,4,5,6,7,8,10);
        fun();

        multiple(2,3,"anmol","bhanu");
    }
    static void fun(int ...v){
        //...v or ...anything => variable length array;
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v){

    }
}
