package com.github.filippajolek.variables_primitives;

import java.util.Scanner;

/*
Write a program calculating the value of the function y = ax ^ 2 + bx + c,
where a, b, c and x are loaded from the user
 */

public class ValueOfTheFunction {
    public static void main(String[] args) {

        double a, b, c, x, y;

        System.out.println("Enter a value A:");
        a = getUserInput();
        System.out.println("Enter a value B:");
        b = getUserInput();
        System.out.println("Enter a value C:");
        c = getUserInput();
        System.out.println("Enter a value X:");
        x = getUserInput();


        y = mathPow(a * x, 2) + mathPow(b, x) + c;

        System.out.println("The value of the function y = ax ^ 2 + bx + c is ");
        System.out.println("y = " + y);

    }

    public static int getUserInput() {
        return new Scanner(System.in).nextInt();
    }

    public static double mathPow(double arg, double n) {
        return Math.pow(arg, n);
    }
}
