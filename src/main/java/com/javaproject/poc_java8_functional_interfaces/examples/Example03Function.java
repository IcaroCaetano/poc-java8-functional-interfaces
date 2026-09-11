package com.javaproject.poc_java8_functional_interfaces.examples;


import com.javaproject.poc_java8_functional_interfaces.model.Person;

import java.util.function.Function;

public class Example03Function {

    public static void main(String[] args) {

        Person person = new Person("Carlos", 42);

        Function<Person, String> getName = personValue -> personValue.getName();

        String name = getName.apply(person);

        System.out.println("Name: " + name);
    }
}