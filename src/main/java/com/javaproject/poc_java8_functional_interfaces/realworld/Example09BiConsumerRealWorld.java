package com.javaproject.poc_java8_functional_interfaces.realworld;


import com.javaproject.poc_java8_functional_interfaces.model.User;

import java.util.function.BiConsumer;

public class Example09BiConsumerRealWorld {

    public static void main(String[] args) {

        User user = new User("icaro", true);

        BiConsumer<User, String> audit = (u, action) ->
                        System.out.println("AUDIT - User: " + u.getUsername() + " | Action: " + action);

        audit.accept(user, "LOGIN");

        audit.accept(user, "ACCESS_CREDIT_DECISION");
    }
}