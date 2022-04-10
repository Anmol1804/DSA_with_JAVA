package com.anmol;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Anmol is good";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('A'));
        System.out.println("    Anmol   ".strip()  );
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
