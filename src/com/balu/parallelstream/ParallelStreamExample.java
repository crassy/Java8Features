package com.balu.parallelstream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {

    public static long checkPerformanceResult(Supplier<Integer> supplier, int noOfTimes){
        long startTime = System.currentTimeMillis();
        for (int i=0; i<noOfTimes; i++){
            supplier.get();
        }
        long endTime = System.currentTimeMillis();
        return  endTime - startTime;
    }
    public static int sumSequentialStream(){
        return IntStream.rangeClosed(1,100000)
                .sum();
    }
    public static int sumParallelStream(){
        return IntStream.rangeClosed(1,100000)
                .parallel()
                .sum();
    }
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());

        System.out.println("sumSequentialStream :  "+checkPerformanceResult(ParallelStreamExample::sumSequentialStream,20));
        System.out.println("sumParallelStream : "+checkPerformanceResult(ParallelStreamExample::sumParallelStream,20));
    }
}
