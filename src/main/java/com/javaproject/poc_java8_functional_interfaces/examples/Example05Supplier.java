package com.javaproject.poc_java8_functional_interfaces.examples;

import java.util.function.Supplier;

public class Example05Supplier {

    public static void main(String[] args) {

        Supplier<String> message = () -> "Hello Java 8";

        String value = message.get();

        System.out.println(value);
    }
}