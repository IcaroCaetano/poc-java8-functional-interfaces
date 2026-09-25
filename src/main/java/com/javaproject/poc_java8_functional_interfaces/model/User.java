package com.javaproject.poc_java8_functional_interfaces.model;

public class User {

    private final String username;
    private final boolean active;

    public User(String username, boolean active) {
        this.username = username;
        this.active = active;
    }

    public String getUsername() {
        return username;
    }

    public boolean isActive() {
        return active;
    }
}