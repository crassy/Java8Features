package com.balu.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxExample {

    private static int getMinValue(List<Integer> integerList){
        return integerList.stream()
                .reduce(0,(a,b)-> a<b?a:b);
    }

    private static int getMaxValue(List<Integer> integerList){
        return integerList.stream()
                .reduce(0,(a,b)-> a>b?a:b);
    }

    private static Optional<Integer> getMaxValueOptional(List<Integer> integerList){
        return integerList.stream()
                .reduce((a,b)-> a>b?a:b);
    }
    private static Optional<Integer> getMinValueOptional(List<Integer> integerList){
        return integerList.stream()
                .reduce((a,b)-> a<b?a:b);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6,7,8,9,10);
//        integerList = new ArrayList<>();
        System.out.println("Min value is: " + getMinValue(integerList));
        System.out.println("Max value is: " + getMaxValue(integerList));
        System.out.println("Optional - Min value is: " + getMinValueOptional(integerList));
        System.out.println("Optional - Max value is: " + getMaxValueOptional(integerList));
    }
}
