package com.anmol;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        dice("", 4);

        System.out.println(diceList("",4));
        customDice("", 7, 8);
    }

    static void dice(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for(int i = 1; i<=6 && i<=target; i++){
            dice(p + i, target-i);
        }
    }

    static ArrayList<String> diceList(String p, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> l = new ArrayList<>();

        for(int i = 1; i<=6 && i<=target; i++){
            l.addAll(diceList(p + i, target-i));
        }
        return l;
    }

    static void customDice(String p, int target, int face){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for(int i = 1; i<=face && i<=target; i++){
            customDice(p + i, target-i, face);
        }
    }
}
