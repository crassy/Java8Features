package com.balu.functionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    static UnaryOperator<String> unaryOperator = (string) -> string.concat(" Default");

    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("java8"));
    }
}
