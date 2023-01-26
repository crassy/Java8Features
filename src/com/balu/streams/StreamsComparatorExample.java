package com.balu.streams;

import com.balu.data.Student;
import com.balu.data.StudentDatabase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorExample {

    public static List<Student> sortedStudentsByName(){
        return StudentDatabase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName).reversed())
                .collect(Collectors.toList());
    }

    public static List<Student> sortedStudentsByGpa(){
        return StudentDatabase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());
    }

    public static List<Student> sortedStudentsByGpaDesc(){
        return StudentDatabase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        System.out.println("Students sorted by NAME: ");
        sortedStudentsByName().forEach(System.out::println);
        System.out.println("Students sorted by GPA: ");
        sortedStudentsByGpa().forEach(System.out::println);
        System.out.println("Students sorted by GPA Desc: ");
        sortedStudentsByGpaDesc().forEach(System.out::println);
    }
}
