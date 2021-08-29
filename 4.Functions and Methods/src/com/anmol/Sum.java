package com.anmol;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        sum1();
        System.out.println(sum2());
    }

    // function
        static void sum1(){
            Scanner in = new Scanner(System.in);
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            System.out.println(num1+num2);
        }

        static int sum2(){
            Scanner in = new Scanner(System.in);
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            return (num1+num2);
        }
}
