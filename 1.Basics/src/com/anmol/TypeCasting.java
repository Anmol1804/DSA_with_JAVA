package com.anmol;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//        System.out.println((float) num);

        // automatic type promotion in expression

//        int a = 250; // 257%256 as max is 256 we can take in byte
//        byte b = (byte) a;
//
//        System.out.println(b);


        byte a = 40;
        byte b = 50;
        byte c = 100;
        int d= a*b/c; // a*b =2000 and byte cant store that but java automatically promotes byte to int in expression
        System.out.println(d);

//        byte e = 50;
//        e=e*2;  // error as e is byte and e*2 is int and cant store a int in byte

        // java is unicode
        System.out.println("नमस्ते");
    }

}
