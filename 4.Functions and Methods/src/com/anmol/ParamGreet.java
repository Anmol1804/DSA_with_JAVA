package com.anmol;

import java.util.Scanner;

public class ParamGreet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String urname1 = greetme("Anmol");
        System.out.println(urname1);
        
        String urname2 = in.nextLine();
        System.out.println(greetme(urname2));
    }

    static String greetme(String name) {
        return "hello "+ name;
    }
}
