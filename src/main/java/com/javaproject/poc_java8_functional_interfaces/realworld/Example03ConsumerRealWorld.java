package com.javaproject.poc_java8_functional_interfaces.realworld;

import com.javaproject.poc_java8_functional_interfaces.model.Customer;

import java.util.function.Consumer;

public class Example03ConsumerRealWorld {

    public static void main(String[] args) {

        Customer customer =
                new Customer(1, "Icaro", 35, true, 120000);

        Consumer<Customer> audit =
                c -> System.out.println("Teste Customer accessed: "
                        + c.getId() + " - " + c.getName()
                );

        audit.accept(customer);
    }
}