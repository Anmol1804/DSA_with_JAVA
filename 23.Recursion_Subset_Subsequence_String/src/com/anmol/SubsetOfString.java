package com.anmol;

import java.util.ArrayList;

public class SubsetOfString {
    public static void main(String[] args) {
        subset("", "abc");
        System.out.println(subseq("", "abc"));

        subsetASCII("", "abc");
        System.out.println(subseqASCII("", "abc"));
    }

    static void subset(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        // taking
        subset(p+ch, up.substring(1));

        //ignoring
        subset(p, up.substring(1));
    }


    static ArrayList<String> subseq(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        // taking
         ArrayList<String> left = subseq(p+ch, up.substring(1));

        //ignoring
        ArrayList<String> right =  subseq(p, up.substring(1));

        left.addAll(right);
        return left;
    }


    static void subsetASCII(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subsetASCII(p+ch, up.substring(1));
        subsetASCII(p, up.substring(1));

        // ASCII => (ch+0)
        subsetASCII(p + (ch+0), up.substring(1));
    }

    static ArrayList<String> subseqASCII(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> first = subseqASCII(p+ch, up.substring(1));
        ArrayList<String> second =  subseqASCII(p, up.substring(1));
        ArrayList<String> third =  subseqASCII(p + (ch+0), up.substring(1));

        first.addAll(second);
        first.addAll(third);

        return first;
    }
}
