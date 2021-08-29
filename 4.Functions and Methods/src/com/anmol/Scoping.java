package com.anmol;

public class Scoping {
    public static void main(String[] args) {
        int a =10;
        int b = 20;

        /*

        Anything outside can be used inside block
        Anything inside block can't be used outside block

        */

        //Block Scoping...
        {
//            int a = 78;   already initialized cant be init again
                a=89;  // we can change it
            int c =99;
            // values initialized in this block cant be used outside block
        }

//        System.out.println(c); // cant use outside block
    }

    static void random(){
        // fn scope
        //System.out.println(a); => error as a is not in scope
        // it belongs to main not random
    }
}
