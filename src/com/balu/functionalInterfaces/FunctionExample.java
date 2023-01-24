package com.balu.functionalInterfaces;

import java.util.function.Function;

public class FunctionExample {

    static final String JAVA8 = "java8";
    static final String DEFAULT = "default";

    static Function<String, String> toUpperFunction = String::toUpperCase;
    static Function<String, String> addDefaultString = (name) -> name.concat(DEFAULT);

    public static void main(String[] args) {
        System.out.println("The result is: " + toUpperFunction.apply(JAVA8));
        System.out.println("AndThen result is: " + toUpperFunction.andThen(addDefaultString).apply(JAVA8));
        System.out.println("Compose Result is: " + toUpperFunction.compose(addDefaultString).apply(JAVA8));
    }
}
