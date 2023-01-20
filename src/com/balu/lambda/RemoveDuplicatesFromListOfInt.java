package com.balu.lambda;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromListOfInt {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,2,3,3,4,5,5,6,7,8,8,9,10);
        /**
         * Imperative.
         */

        List<Integer> uniqueList = new ArrayList<>();
        for(Integer integer : integerList){
            if(!uniqueList.contains(integer)){
                uniqueList.add(integer);
            }
        }

        System.out.println("I - Unique List: " + uniqueList);
        /**
         * Declarative.
         */

        List<Integer> uniqueList2 = integerList.stream().distinct().collect(Collectors.toList());
        System.out.println("D - uniqueList2: " + uniqueList2);
    }
}