package com.balu.streams;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CollectionsVsStream {
    static ArrayList<String> names = new ArrayList<>();
    public static void main(String[] args) {

        names.add("Adam");
        names.add("Jim");
        names.add("Angel");

        System.out.println(" All Names: "+ names);

        printNames();
        System.out.println("another::::");
        printNames();

//        names.remove(0);
//        System.out.println("After removing 0 element : Names are: " + names);

        System.out.println("Streams -----------------------");
//        names.stream().
        System.out.println(names.get(1));

        System.out.println("Streams -----------------------11111111");
        Stream<String> nameStream = names.stream();
        nameStream.forEach(System.out::println);
        //nameStream.forEach(System.out::println); //Invoking 2nd time - Will cause an Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
        //	at java.base/java.util.stream.AbstractPipeline.sourceStageSpliterator(AbstractPipeline.java:279)

    }

    static Consumer<String> printNames = (name)-> System.out.println(name);
    static void printNames(){
        names.forEach(printNames);
    }
}
