package com.balu.streams;

import com.balu.data.Student;
import com.balu.data.StudentDatabase;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {

        Predicate<Student> studentPredicate = student -> student.getGradeLevel() >= 3;

        Predicate<Student> studentGPAPredicate = student -> student.getGpa() >= 3.9;

        // Student name and there activities in a map.
        Map<String, List<String>> stringListMap = StudentDatabase.getAllStudents()
                .parallelStream().filter(studentPredicate).filter(studentGPAPredicate)
                .collect(
                        Collectors.toMap(Student::getName, Student::getActivities)
                );
        System.out.println(stringListMap);
    }
}
