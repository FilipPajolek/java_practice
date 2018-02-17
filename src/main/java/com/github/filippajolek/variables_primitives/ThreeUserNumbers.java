package com.github.filippajolek.variables_primitives;

import java.util.Scanner;
/*
Load 3 numbers from the user, calculate the average and write
 */

public class ThreeUserNumbers {
    public static void main(String[] args) {

        double a, b, c;
        double average;

        System.out.println("Enter the first number: ");
        a = getUserInput();
        System.out.println("Enter the second number: ");
        b = getUserInput();
        System.out.println("Enter the third number: ");
        c = getUserInput();

        average = (a + b + c) / 3;

        System.out.println("The average number is: " + average);

    }

    public static double getUserInput() {
        return new Scanner(System.in).nextDouble();
    }
}
