package com.anmol;

import java.util.Objects;
import java.util.Scanner;

public class SwitchEx {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

//        if (fruit.equals("mango")){
//            System.out.println("King of fruit");
//        }
//
//        if(fruit.equals("apple")){
//            System.out.println("a sweet red fruit");
//        }

//

        // new syntax;

        switch (fruit) {
            case "Mango" -> System.out.println("King of fruit");
            case "Apple" -> System.out.println("Sweet red  fruit");
            case "Orange" -> System.out.println("Round fruit");
            case "Grapes" -> System.out.println("Small fruit");
            default -> System.out.println("Enter a valid fruit");
        }


    }
}
