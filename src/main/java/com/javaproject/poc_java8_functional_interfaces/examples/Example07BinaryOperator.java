package com.javaproject.poc_java8_functional_interfaces.examples;

import java.util.function.BinaryOperator;

public class Example07BinaryOperator {

    public static void main(String[] args) {

        BinaryOperator<Integer> sum = (a, b) -> a + b;

        Integer result = sum.apply(10, 5);

        System.out.println(result);
    }
}