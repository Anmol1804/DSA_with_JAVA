package com.anmol;

public class Conditionals {

    public static void main(String[] args) {

        int salary = 5000;
        if(salary>10000){
            salary = salary + 2000;
        }
        else{
            salary = salary + 1000;
        }

        System.out.println(salary);
    }
}
