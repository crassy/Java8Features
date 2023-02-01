package com.balu.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author Crassy
 * IntStream:
 * IntStream.range(1,50) will return an IntStream of 49 elements from 1 to 49.
 * IntStream.rangeClosed(1,50) will return an IntStream of 50 elements from 1 to 50.
 * LongStream:
 * LongStream.range(1,50) will return an LongStream of 49 elements from 1 to 49.
 * LongStream.rangeClosed(1,50) will return an LongStream of 50 elements from 1 to 50.
 *
 * DoubleStream - it does not support the range() and rangeClosed() methods.
 * +
 *
 */
public class NumericStreamsExample {


    public static int sumOfNumbers(List<Integer> integerList){
        return integerList.stream()
                .reduce(0, (x, y) -> x+y);
    }

    public static int sumOfNumbersIntStream(){
        return IntStream.rangeClosed(1,6)
                .sum();
    }
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);

        System.out.println("Sum of N Numbers: " + sumOfNumbers(integerList));
        System.out.println("SumOfNumbersIntStream Numbers: " + sumOfNumbersIntStream());

        IntStream intStreamRange = IntStream.range(1,50);
        System.out.println(" Range Count: " + intStreamRange.count());

        IntStream.range(1,50).forEach(value -> System.out.print(value + ","));
        System.out.println();
        IntStream.rangeClosed(1,50).forEach(value -> System.out.print(value + ","));
        System.out.println();

        System.out.println(" RangeClosed Count: " + IntStream.rangeClosed(1,50).count());
        System.out.println(" RangeClosed sum: " + IntStream.rangeClosed(1,50).sum());
    }
}
