package com.github.filippajolek.variables_primitives;

import java.util.Scanner;

/*
Write a program to convert the amount in PLN into EUR.
 */

public class CurrencyConverter {
    public static void main(String[] args) {

        float amount;
        float conventerEur = 4.18f;

        System.out.println("Enter the amount in PLN: ");
        int getUserInput = new Scanner(System.in).nextInt();

        amount = getUserInput / conventerEur;

        amount = getAmount(amount); //In addition, I added the method to display only two decimal places

        System.out.println("The amount after currency conversion into the euro is: " + amount + " EUR");

    }

    private static float getAmount(float amount) {
        amount *= 100;
        amount = Math.round(amount);
        amount /= 100;
        return amount;

    }

}
