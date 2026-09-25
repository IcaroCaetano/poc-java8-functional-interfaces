package com.javaproject.poc_java8_functional_interfaces.realworld;

import java.util.function.UnaryOperator;

public class Example05UnaryOperatorRealWorld {

    public static void main(String[] args) {

        UnaryOperator<String> normalizeName = name -> name.trim().toUpperCase();

        String name = normalizeName.apply("  Icaro  ");

        System.out.println(name);
    }
}