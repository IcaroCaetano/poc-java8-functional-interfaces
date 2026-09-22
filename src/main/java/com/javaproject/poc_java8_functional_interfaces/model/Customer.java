package com.javaproject.poc_java8_functional_interfaces.model;

public class Customer {

    private final String name;
    private final int age;
    private final boolean active;

    public Customer(String name, int age, boolean active) {
        this.name = name;
        this.age = age;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isActive() {
        return active;
    }
}