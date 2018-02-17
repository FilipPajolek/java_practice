package com.github.filippajolek.variables_primitives;

/*
1. Create 3 variables (variableA, variableB, variableC) and assign them to values 10, 20, 30
2. Print the values of all variables
3. Print text - "--- I change values ---"
4. Change the previously created variable values to 200, 300, 400
5. Print the values of all variables after changing the value
 */

public class ThreeVariables {
    public static void main(String[] args) {

        int variableA = 10;
        int variableB = 20;
        int variableC = 30;

        System.out.println("Variables: A: " + variableA + ", B: " + variableB + ", C: " + variableC + ".");
        System.out.println("--- I change values... ---");

        variableA = 200;
        variableB = 300;
        variableC = 400;

        System.out.println("New values of variables: A: " + variableA + ", B: " + variableB + ", C: " + variableC + ".");
    }

}
