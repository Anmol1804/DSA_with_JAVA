package com.anmol;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1 -> System.out.println("Anmol");
            case 2 -> System.out.println("Kunal");
            case 3 -> {
                System.out.println(" emp num 3");
                switch (department) {
                    case "IT" -> System.out.println("It dptmt");
                    case "Management" -> System.out.println("Mngmt Dptmt");
                    default -> System.out.println("No dept ");
                }
            }
            default -> System.out.println("invalid id");
        }
    }
}
