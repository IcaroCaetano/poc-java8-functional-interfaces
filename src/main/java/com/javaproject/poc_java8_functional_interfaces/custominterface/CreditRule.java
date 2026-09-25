package com.javaproject.poc_java8_functional_interfaces.custominterface;

import com.javaproject.poc_java8_functional_interfaces.model.Customer;

@FunctionalInterface
public interface CreditRule {

    boolean evaluate(Customer customer);
}