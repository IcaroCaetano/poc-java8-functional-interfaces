package com.javaproject.poc_java8_functional_interfaces.realworld;


import com.javaproject.poc_java8_functional_interfaces.model.Customer;
import com.javaproject.poc_java8_functional_interfaces.model.CustomerDTO;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Example11FunctionalInterfacesIntegration {

    public static void main(String[] args) {

        List<Customer> customers = Arrays.asList(
                new Customer(1, "Icaro", 44, true, 12000),
                new Customer(2, "John", 17, true, 3000),
                new Customer(3, "Mary", 30, false, 8000),
                new Customer(4, "Peter", 25, true, 7000)
        );

        Predicate<Customer> isEligible = customer -> customer.isActive() && customer.getAge() >= 18;

        Function<Customer, CustomerDTO> toDTO =
                customer -> new CustomerDTO(customer.getId(), customer.getName());

        Consumer<CustomerDTO> audit =
                dto -> System.out.println("AUDIT - Customer: " + dto.getId() + " - " + dto.getName());

        for (Customer customer : customers) {

            if (isEligible.test(customer)) {

                CustomerDTO dto = toDTO.apply(customer);

                audit.accept(dto);
            }
        }
    }
}