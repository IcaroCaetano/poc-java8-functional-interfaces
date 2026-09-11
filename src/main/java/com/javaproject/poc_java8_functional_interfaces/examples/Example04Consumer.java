package com.javaproject.poc_java8_functional_interfaces.examples;


import com.javaproject.poc_java8_functional_interfaces.model.Person;

import java.util.function.Consumer;

public class Example04Consumer {

    public static void main(String[] args) {

        Person person = new Person("Carlos", 42);

        Consumer<Person> printPerson = value -> System.out.println(value);

        printPerson.accept(person);
    }
}