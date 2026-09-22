package com.javaproject.poc_java8_functional_interfaces.examples;

import java.util.function.BiFunction;

public class Example08BiFunction {

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;

        Integer result = sum.apply(10, 5);

        System.out.println(result);
    }
}