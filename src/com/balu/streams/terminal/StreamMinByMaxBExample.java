package com.balu.streams.terminal;

import com.balu.data.Student;
import com.balu.data.StudentDatabase;

import java.util.Comparator;
import java.util.Optional;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

public class StreamMinByMaxBExample {

    public static Optional<Student> minByExample() {
            return StudentDatabase.getAllStudents().stream()
                    .collect(minBy(Comparator.comparing(Student::getGpa)));
    }
    public static Optional<Student> maxByExample() {
        return StudentDatabase.getAllStudents().stream()
                .collect(maxBy(Comparator.comparing(Student::getGpa)));
    }
    public static void main(String[] args) {
        System.out.println(minByExample());
        System.out.println(maxByExample());
    }
}
