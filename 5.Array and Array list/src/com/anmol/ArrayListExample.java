package com.anmol;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Syntax
        ArrayList<Integer> list = new ArrayList<>(5);
        /*
        list.add(23);
        list.add(12);
        list.add(123);
        list.add(312);
        list.add(132);
        list.add(112);


        System.out.println(list.contains(123));
        list.set(0,99);
        list.remove(1);
        System.out.println(list);

        System.out.println(list.toArray()[0]);
        */

        // input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }

    }
}
