package com.javaproject.poc_java8_functional_interfaces.realworld;

import com.javaproject.poc_java8_functional_interfaces.model.Customer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Example01PredicateRealWorld {

    public static void main(String[] args) {

        List<Customer> customers = Arrays.asList(
                new Customer("Icaro", 44, true),
                new Customer("John", 17, true),
                new Customer("Mary", 30, false),
                new Customer("Peter", 25, true)
        );

        Predicate<Customer> isEligible =
                customer -> customer.getAge() >= 18 && customer.isActive();

        List<Customer> eligibleCustomers = filterCustomers(customers, isEligible);

        eligibleCustomers.forEach(customer -> System.out.println(customer.getName()));
    }

    private static List<Customer> filterCustomers(
            List<Customer> customers,
            Predicate<Customer> condition) {

        return customers.stream()
                .filter(condition)
                .collect(Collectors.toList());
    }
}

/**
 * Icaro
 * Peter
 */