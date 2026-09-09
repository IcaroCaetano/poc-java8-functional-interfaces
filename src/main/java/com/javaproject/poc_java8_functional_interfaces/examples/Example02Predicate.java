package com.javaproject.poc_java8_functional_interfaces.examples;

import com.javaproject.poc_java8_functional_interfaces.model.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Example02Predicate {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Maria", 34),
                new Person("João", 17),
                new Person("Carlos", 42),
                new Person("Ana", 27)
        );

        Predicate<Person> isAdult = person -> person.getAge() >= 18;

        for (Person person : people) {

            if (isAdult.test(person)) {
                System.out.println(person.getName() + " is adult");
            }
        }
    }
}