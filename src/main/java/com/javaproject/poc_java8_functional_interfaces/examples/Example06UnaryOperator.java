package com.javaproject.poc_java8_functional_interfaces.examples;

import java.util.function.UnaryOperator;

public class Example06UnaryOperator {

    public static void main(String[] args) {

        UnaryOperator<Integer> doubleValue = value -> value * 2;

        Integer result = doubleValue.apply(10);

        System.out.println("Result: " + result);
    }
}