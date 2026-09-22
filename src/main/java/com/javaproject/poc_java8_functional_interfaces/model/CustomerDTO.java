package com.javaproject.poc_java8_functional_interfaces.model;

public class CustomerDTO {

    private final long id;
    private final String name;

    public CustomerDTO(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}