package com.anmol;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();

        /*
          for (int i = 0; i <n ; i++) {
            System.out.print(i + " ");
         }

         */

        /*
        int i = 0;
        while (i<n){
            System.out.print(i+" ");
            i++;
        }

         */

        int num =1;
        do{
            System.out.println(num);
            num++;
        }while (num!=5);

    }
}
