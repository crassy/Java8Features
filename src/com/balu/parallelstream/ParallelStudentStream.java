package com.balu.parallelstream;

import com.balu.data.Student;
import com.balu.data.StudentDatabase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class ParallelStudentStream {
    public static List<String> sequentialPrintStudentActivities(){
        long startTime = System.currentTimeMillis();

        List<String> studentActivities = StudentDatabase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(toList());

        long endTime = System.currentTimeMillis();

        System.out.println("Duration : " + (endTime - startTime));
        return studentActivities;

    }

    public static List<String> parallelPrintStudentActivities(){
        long startTime = System.currentTimeMillis();

        List<String> studentActivities = StudentDatabase.getAllStudents()
                .stream()
                .parallel()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(toList());

        long endTime = System.currentTimeMillis();

        System.out.println(" parallel Duration : " + (endTime - startTime));
        return studentActivities;

    }

    public static void main(String[] args) {
        System.out.println(sequentialPrintStudentActivities());
        System.out.println(parallelPrintStudentActivities());
    }
}
