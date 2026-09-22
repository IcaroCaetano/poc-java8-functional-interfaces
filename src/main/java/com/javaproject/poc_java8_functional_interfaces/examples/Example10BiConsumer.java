package com.javaproject.poc_java8_functional_interfaces.examples;

import java.util.function.BiConsumer;

public class Example10BiConsumer {

    public static void main(String[] args) {

        BiConsumer<String, Integer> printPerson = (name, age) ->
                        System.out.println(name + " - " + age);

        printPerson.accept("John", 40);
    }
}