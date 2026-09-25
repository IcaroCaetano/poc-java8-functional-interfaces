package com.javaproject.poc_java8_functional_interfaces.realworld;

import com.javaproject.poc_java8_functional_interfaces.model.Customer;
import com.javaproject.poc_java8_functional_interfaces.model.CustomerDTO;

import java.util.function.Function;

public class Example02FunctionRealWorld {

    public static void main(String[] args) {

        Customer customer = new Customer(1, "Icaro", 35, true, 12000);

        Function<Customer, CustomerDTO> toDTO =
                cust -> new CustomerDTO(
                        cust.getId(),
                        cust.getName()
                );

        CustomerDTO dto = toDTO.apply(customer);

        System.out.println(dto);
    }
}
