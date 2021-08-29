package com.anmol;

import java.util.Scanner;

public class ParamSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = sum3(10,20);
        System.out.println(ans);

        int n1 = in.nextInt();
        int n2 = in.nextInt();
        System.out.println(sum3(n1,n2));
    }

    static int sum3(int a, int b){
        return (a+b);
    }
}
