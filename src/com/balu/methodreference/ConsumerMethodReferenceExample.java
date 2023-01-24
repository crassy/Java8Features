package com.balu.methodreference;

import com.balu.data.Student;
import com.balu.data.StudentDatabase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

    static Consumer<Student> studentConsumer = System.out::println;

    static Consumer<Student> secondStudentConsumer = Student::printListOfActivities;
    public static void main(String[] args) {
        StudentDatabase.getAllStudents().forEach(studentConsumer);
        StudentDatabase.getAllStudents().forEach(secondStudentConsumer);
    }
}
