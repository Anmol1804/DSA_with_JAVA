package com.anmol;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
//        factors1(40);
        factors2(40);
    }

//    T.C = O(sqrt(n))
    static void factors1(int n){
        for (int i = 1; i < Math.sqrt(n); i++) {
            if(n%i == 0){
                // removing duplicates (ex 6*6 = 36, we want once only 6)
                if(n/i == i){
                    System.out.print(i + " ");
                }
                System.out.print(i + " " + n/i + " ");
            }
        }
    }

//    Here T.C and Space complexity both will be O(sqrt(n))
//    print ins sorted order
    static void factors2(int n){
        ArrayList<Integer> l= new ArrayList<>();
        for (int i = 1; i < Math.sqrt(n); i++) {
            if(n%i == 0){
                // removing duplicates (ex 6*6 = 36, we want once only 6)
                if(n/i == i){
                    System.out.print(i + " ");
                }
                System.out.print(i + " ");
                l.add(n/i);
            }
        }

        for (int i = l.size()-1; i >=0 ; i--) {
            System.out.print(l.get(i) + " ");
            
        }
    }
}
