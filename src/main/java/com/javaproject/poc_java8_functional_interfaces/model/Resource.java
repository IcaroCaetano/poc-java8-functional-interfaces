package com.javaproject.poc_java8_functional_interfaces.model;

public class Resource {

    private final String name;
    private final boolean publicResource;

    public Resource(String name, boolean publicResource) {
        this.name = name;
        this.publicResource = publicResource;
    }

    public String getName() {
        return name;
    }

    public boolean isPublicResource() {
        return publicResource;
    }
}