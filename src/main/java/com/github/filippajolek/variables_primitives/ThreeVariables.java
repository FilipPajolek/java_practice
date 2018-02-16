package com.github.filippajolek.variables_primitives;

public class ThreeVariables {
    public static void main(String[] args) {

        int variableA = 10;
        int vairableB = 20;
        int variableC = 30;

        System.out.println("Variables: A: " + variableA + ", B: " + vairableB + ", C: " + variableC + ".");
        System.out.println("--- I change values... ---");

        variableA = 200;
        vairableB = 300;
        variableC = 400;

        System.out.println("New values of variables: A: " + variableA + ", B: " + vairableB + ", C: " + variableC + ".");
    }

}
