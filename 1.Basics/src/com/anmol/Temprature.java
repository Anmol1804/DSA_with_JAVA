package com.anmol;

import java.util.Scanner;

public class Temprature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float tempC = in.nextFloat();
        float tempf = (tempC * 9/5) + 32;
        System.out.println(tempf);
    }
}
