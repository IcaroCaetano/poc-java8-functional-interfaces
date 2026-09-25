package com.javaproject.poc_java8_functional_interfaces.realworld;


import com.javaproject.poc_java8_functional_interfaces.model.Resource;
import com.javaproject.poc_java8_functional_interfaces.model.User;

import java.util.function.BiPredicate;

public class Example08BiPredicateRealWorld {

    public static void main(String[] args) {

        User user = new User("icaro", true);
        Resource resource = new Resource("Credit Decision", false);

        BiPredicate<User, Resource> canAccess =
                (u, r) -> u.isActive() && r.isPublicResource();

        boolean allowed = canAccess.test(user, resource);

        System.out.println("Access allowed: " + allowed);
    }
}