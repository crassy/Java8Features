package com.balu.streams;

import com.balu.data.Student;
import com.balu.data.StudentDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExample {

    public static List<String> namesList(){
        List<String> studentList = StudentDatabase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.toList());
        return studentList;
    }

    public static void main(String[] args) {
        System.out.println(namesList());
    }
}
