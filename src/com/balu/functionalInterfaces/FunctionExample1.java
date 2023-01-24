package com.balu.functionalInterfaces;

public class FunctionExample1 {
    public static String preformConcat(String string){
        return FunctionExample.addDefaultString.apply(string);
    }

    public static void main(String[] args) {
        System.out.println("Result: " + preformConcat("Hello"));
    }
}
