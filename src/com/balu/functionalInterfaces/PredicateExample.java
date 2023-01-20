package com.balu.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> integerPredicate = (i) -> i % 2 == 0;
    static Predicate<Integer> predicateFive = (i) -> i % 5 == 0;
    public static void predicateAnd(){
        System.out.println("predicateAnd 2,5 for 10: " + predicateFive.and(integerPredicate).test(10));
        System.out.println("predicateAnd 2,5 for 9: " + predicateFive.and(integerPredicate).test(9));
    }

    public static void predicateOr(){
        System.out.println("predicateOr 2,5 for 10: " + predicateFive.or(integerPredicate).test(10));
        System.out.println("predicateOr 2,5 for 15: " + predicateFive.or(integerPredicate).test(15));
    }

    public static void predicateNegate(){
        System.out.println("predicateOrNegate 2,5 for 10: " + predicateFive.or(integerPredicate).negate().test(10));
    }
    public static void main(String[] args) {

        System.out.println(integerPredicate.test(4));
        predicateAnd();
        predicateOr();
        predicateNegate();
    }
}
