package com.javaproject.poc_java8_functional_interfaces.realworld;

import java.math.BigDecimal;
import java.util.function.BinaryOperator;

public class Example06BinaryOperatorRealWorld {

    public static void main(String[] args) {

        BinaryOperator<BigDecimal> sum = (value1, value2) -> value1.add(value2);

        BigDecimal value1 = new BigDecimal("150.00");
        BigDecimal value2 = new BigDecimal("250.00");

        BigDecimal total = sum.apply(value1, value2);

        System.out.println("Total: " + total);
    }
}