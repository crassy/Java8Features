package com.balu.streams;

import com.balu.data.Student;
import com.balu.data.StudentDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {

    public static List<Student> filterFemaleStudents(){
        return StudentDatabase.getAllStudents().stream()
                .filter(student -> student.getGender().equalsIgnoreCase("female"))
                .collect(Collectors.toList());
    }
    private static int noOfNoteBooks(){
        return StudentDatabase.getAllStudents().stream()
                .map(Student::getNoOfNoteBooks)
//                .reduce(0, (a,b)-> a+b);
                .reduce(0,Integer::sum);
    }
    public static void main(String[] args) {
//        System.out.println(filterFemaleStudents());
//        filterFemaleStudents().forEach(System.out::println);
        System.out.println(noOfNoteBooks());
    }
}
