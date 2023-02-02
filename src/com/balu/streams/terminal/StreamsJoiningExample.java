package com.balu.streams.terminal;

import com.balu.data.Student;
import com.balu.data.StudentDatabase;

import java.util.stream.Collectors;

public class StreamsJoiningExample {

    public static String joining_1(){
        return StudentDatabase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining());
    }

    public static String joining_Delimeter(){
        return StudentDatabase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining("-"));
    }

    public static String joining_DelimeterPrefixSuffix(){
        return StudentDatabase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining("-","(", ")"));
    }

    public static void main(String[] args) {
        System.out.println(joining_1());
        System.out.println(joining_Delimeter());
        System.out.println(joining_DelimeterPrefixSuffix());
    }
}
