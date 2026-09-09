package com.javaproject.poc_java8_functional_interfaces.examples;

public class Example01FunctionalInterface {

    @FunctionalInterface
    interface Calculator {

        int calculate(int a, int b);
    }

    public static void main(String[] args) {

        Calculator addition = (a, b) -> a + b;

        Calculator subtraction = (a, b) -> a - b;

        Calculator multiplication = (a, b) -> a * b;

        System.out.println("Addition: " + addition.calculate(10, 5));

        System.out.println("Subtraction: " + subtraction.calculate(10, 5));

        System.out.println("Multiplication: " + multiplication.calculate(10, 5));

    }
}