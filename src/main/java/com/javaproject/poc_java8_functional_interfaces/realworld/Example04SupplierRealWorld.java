package com.javaproject.poc_java8_functional_interfaces.realworld;

import java.util.Optional;
import java.util.UUID;
import java.util.function.Supplier;

public class Example04SupplierRealWorld {

    public static void main(String[] args) {

        Supplier<String> tokenGenerator = () -> UUID.randomUUID().toString();

        // So é executado quando solicitado
        String token = tokenGenerator.get();

        System.out.println("Token: " + token);

        System.out.println(getName("Icaro"));
        System.out.println(getName(null));
    }

    private static String getName(String name) {

        return Optional.ofNullable(name).orElseGet(() -> "Unknown");
    }
}