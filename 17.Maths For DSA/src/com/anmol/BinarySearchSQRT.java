package com.anmol;

public class BinarySearchSQRT {
    public static void main(String[] args) {
        int n = 40;

        // precision
        int p = 3;

        System.out.printf("%.3f", sqrt(n, p));
    }

    static double sqrt(int n, int p){
        int s = 0;
        int e = n;

        double root = 0.0;

        while (s<e){
            int m = s+(e-s)/2;
            if(m*m == n){
                //here m will be root for perfect
                return m;
            }

            if(m*m > n){
                e = m - 1;
            }
            else {
                s = m+1;
            }
            
        }

        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n){
                root += incr;
            }

            // this is one subtracted to revert back to 1 step back as
            // root will be 1 precise more thats why it didnt pass loop
            root -= incr;
            incr/=10;
        }

        return root;
    }
}
