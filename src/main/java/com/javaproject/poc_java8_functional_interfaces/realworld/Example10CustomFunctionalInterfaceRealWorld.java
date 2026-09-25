package com.javaproject.poc_java8_functional_interfaces.realworld;


import com.javaproject.poc_java8_functional_interfaces.custominterface.CreditRule;
import com.javaproject.poc_java8_functional_interfaces.model.Customer;

public class Example10CustomFunctionalInterfaceRealWorld {

    public static void main(String[] args) {

        Customer customer =
                new Customer(1, "Icaro", 35, true, 120000);

        CreditRule isEligible =
                c -> c.getAge() >= 18 && c.isActive() && c.getMonthlyIncome() >= 5000;

        boolean eligible = isEligible.evaluate(customer);

        System.out.println("Customer eligible: " + eligible);
    }
}