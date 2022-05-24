package com.anmol;

public class RangeXor {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;

        System.out.println(xor(a-1)^xor(9));
    }

//    xor from 0 to a
    static int xor(int a){
        if(a%4 == 0){
            return a;
        }
        else if(a%4 == 1){
            return 1;
        }
        else if(a%4 == 2){
            return a+1;
        }

        //a%4==3
        return 0;
    }
}
