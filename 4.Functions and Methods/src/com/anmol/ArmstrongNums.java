package com.anmol;

import java.util.Scanner;

/*
    153 => (1^3 + 5^3 + 3^3)
    if cube of digits = num
 */
public class ArmstrongNums {
    public static void main(String[] args) {

        for(int i=100; i<1000; i++){
            if(isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
    }

        static boolean isArmstrong(int n){
            int orig = n;
            int sum = 0;
            while (n>0){
                int d = n%10;
                sum = sum + (d*d*d);
                n=n/10;
            }

            return (sum == orig);
        }

}
