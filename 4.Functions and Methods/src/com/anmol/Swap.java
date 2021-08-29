package com.anmol;

public class Swap {
    public static void main(String[] args) {
        int a=10;
        int b=20;

//        int temp = a;
//        a=b;
//        b=temp;

        swap(a,b);
        System.out.println(a + " " + b);

        String name = "Anmol gera";
        changeName(name);
        System.out.println(name);

    }

    static void swap(int a, int b){
        int temp = a;
        a=b;
        b=temp;
    }

    static void changeName(String name){
        name = "Anmol Kalra";
    }
}
