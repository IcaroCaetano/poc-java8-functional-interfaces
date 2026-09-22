package com.javaproject.poc_java8_functional_interfaces.examples;

public class Example11CustomFunctionalInterface {

    public static void main(String[] args) {

        Calculator addition = (a, b) -> a + b;

        Calculator subtraction = (a, b) -> a - b;

        Calculator multiplication = (a, b) -> a * b;

        System.out.println(addition.calculate(10, 5));

        System.out.println(subtraction.calculate(10, 5));

        System.out.println(multiplication.calculate(10, 5));
    }
}

@FunctionalInterface
interface Calculator {

    int calculate(int a, int b);

}