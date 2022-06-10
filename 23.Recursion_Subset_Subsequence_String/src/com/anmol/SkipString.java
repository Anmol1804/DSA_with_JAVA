package com.anmol;

public class SkipString {
    public static void main(String[] args) {
        String str = "bappleccappd";
        System.out.println(skipApple(str));
        System.out.println(skipAppNotApple(str));

    }

    static String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("apple")){
            return skipApple(up.substring("apple".length()));
        }
        else {
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }

    static String skipAppNotApple(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipAppNotApple(up.substring("app".length()));
        }
        else {
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }
}
