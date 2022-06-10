package com.anmol;

import java.util.ArrayList;

// Note this is not backtracking
public class MazeProblem {
    public static void main(String[] args) {
        // count of posssible paths
        System.out.println(count(3,3));

        // paths
        paths("",3,3);
        System.out.println(pathList("", 3,3));

        // paths including diagonal
        System.out.println(pathDiagonalList("", 3, 3));
    }

    static int count(int r, int c){
        if(r==1 || c==1){
            return 1;
        }
//        left ans + right ans
        return count(r-1,c) + count(r,c-1);
    }

    static void paths(String p, int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }

        if(r>1){
            paths(p+ "D", r-1,c);
        }

        if(c>1){
            paths(p + "R", r, c-1);
        }
    }

    static ArrayList<String> pathList(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> l = new ArrayList<>();

        if(r>1){
            l.addAll(pathList(p+ "D", r-1,c));
        }

        if(c>1){
            l.addAll(pathList(p + "R", r, c-1));
        }

        return l;
    }

    static ArrayList<String> pathDiagonalList(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> l = new ArrayList<>();

        if(r>1 && c>1){
            l.addAll(pathDiagonalList(p+ "D", r-1, c-1));
        }

        if(r>1){
            l.addAll(pathDiagonalList(p+ "V", r-1,c));
        }

        if(c>1){
            l.addAll(pathDiagonalList(p + "H", r, c-1));
        }

        return l;
    }
}
