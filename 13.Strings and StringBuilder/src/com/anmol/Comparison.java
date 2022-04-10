package com.anmol;

public class Comparison {
    public static void main(String[] args) {
        String a = "Anmol";
        String b = "Anmol";

        // ==
        System.out.println(a == b);
        String c = a;
        System.out.println(c == a);

        String a1 = new String("Anmol");
        String b1 = new String("Anmol");
        System.out.println(a1 == b1);

        // .equals care only for value
        System.out.println(a1.equals(b1));


        // char at particular index
        System.out.println(a1.charAt(0));
    }
}
