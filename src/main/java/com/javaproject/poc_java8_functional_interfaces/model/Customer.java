package com.javaproject.poc_java8_functional_interfaces.model;

public class Customer {

    private final long id;
    private final String name;
    private final int age;
    private final boolean active;
    private final double monthlyIncome;

    public Customer(
            long id,
            String name,
            int age,
            boolean active,
            double monthlyIncome) {

        this.id = id;
        this.name = name;
        this.age = age;
        this.active = active;
        this.monthlyIncome = monthlyIncome;
    }


    public long getId() {
        return id;
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

    public double getMonthlyIncome() {
        return monthlyIncome;
    }
}