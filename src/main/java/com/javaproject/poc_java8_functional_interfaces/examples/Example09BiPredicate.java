package com.javaproject.poc_java8_functional_interfaces.examples;

import java.util.function.BiPredicate;

public class Example09BiPredicate {

    public static void main(String[] args) {

        BiPredicate<Integer, Integer> isGreater = (a, b) -> a > b;

        System.out.println(isGreater.test(10, 5));
        System.out.println(isGreater.test(3, 8));
    }
}