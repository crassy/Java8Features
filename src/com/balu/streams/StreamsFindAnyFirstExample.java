package com.balu.streams;

import com.balu.data.Student;
import com.balu.data.StudentDatabase;

import java.util.Optional;

public class StreamsFindAnyFirstExample {
    public static void main(String[] args) {
        Optional<Student> studentOptionalFindAny = findAnyStudent();
        if(studentOptionalFindAny.isPresent()){
            System.out.println("Found the student: " + studentOptionalFindAny.get());
        } else {
            System.out.println("No students found.");
        }

        Optional<Student> studentOptionalFindFirst = findFirstStudent();
        if(studentOptionalFindFirst.isPresent()){
            System.out.println("Found the student: " + studentOptionalFindFirst.get());
        } else {
            System.out.println("No students found.");
        }
    }

    public static Optional<Student> findAnyStudent(){
        return StudentDatabase.getAllStudents().stream()
                .filter(student -> student.getGpa() >=3.9)
                .findAny();
    }

    public static Optional<Student> findFirstStudent(){
        return StudentDatabase.getAllStudents().stream()
                .filter(student -> student.getGpa() >=3.9)
                .findFirst();
    }
}
