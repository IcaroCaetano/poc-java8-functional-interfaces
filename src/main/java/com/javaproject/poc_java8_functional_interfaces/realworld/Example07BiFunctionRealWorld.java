package com.javaproject.poc_java8_functional_interfaces.realworld;

import java.math.BigDecimal;
import java.util.function.BiFunction;

public class Example07BiFunctionRealWorld {

    public static void main(String[] args) {

        BiFunction<BigDecimal, BigDecimal, BigDecimal> calculateDiscount =
                (price, discountPercentage)
                        -> price.subtract(price.multiply(discountPercentage));

        BigDecimal price = new BigDecimal("1000.00");
        BigDecimal discount = new BigDecimal("0.10");

        BigDecimal finalPrice = calculateDiscount.apply(price, discount);

        System.out.println("Final price: " + finalPrice);
    }
}