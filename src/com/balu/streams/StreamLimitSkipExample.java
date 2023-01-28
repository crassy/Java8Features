package com.balu.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimitSkipExample {

    public static Optional<Integer> limit (List<Integer> integers){
        return integers.stream()
                .limit(3)// 6, 7, 8 will be added and the result is: 21.
                .reduce(Integer::sum);
    }

    public static Optional<Integer> skip (List<Integer> integers){
        return integers.stream()
                .skip(3)// 9, 10 will be added, and the result is: 19.
                .reduce(Integer::sum);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6,7,8,9,10);

        Optional<Integer> limitResult = limit(integerList);
        if(limitResult.isPresent()){
            System.out.println("The limit result is: " + limitResult.get());
        } else {
            System.out.println("No input is passed.");
        }

        Optional<Integer> skipResult = skip(integerList);
        if(skipResult.isPresent()){
            System.out.println("The skip result is: " + skipResult.get());
        } else {
            System.out.println("No input is passed.");
        }
    }
}
