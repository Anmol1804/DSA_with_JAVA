package com.anmol;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // TAke input from user till user doesn't press X or x

        int ans = 0;

        while (true){
            // take operator
            System.out.print("Enter operator : ");
            char op = in.next().trim().charAt(0);

            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                // input 2 nums
                System.out.print("Enter two numbers : ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if( op == '+'){
                    ans = num1 + num2;
                }
                if( op == '-'){
                    ans = num1 - num2;
                }
                if( op == '*'){
                    ans = num1 * num2;
                }

                if( op == '/'){
                    if(num2!=0){
                        ans = num1 / num2;
                    }
                }
                if(op == '%') {
                    ans = num1 % num2;
                }

                System.out.println(ans);

            }

            else if(op == 'x' || op == 'X'){
                break;
            }
            else {
                System.out.println("Invalid operation");
            }
        }

    }
}
