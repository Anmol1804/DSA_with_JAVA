package com.anmol;

public class StrBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' +i);
            builder.append(ch);
//            many methods
        }
        System.out.println(builder);
    }
}
