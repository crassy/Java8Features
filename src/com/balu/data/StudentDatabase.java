package com.balu.data;

import java.util.Arrays;
import java.util.List;

public class StudentDatabase {

    private static List<Student> studentList ;

    private static StudentDatabase studentDatabase = null;

    private StudentDatabase(){
        Student student1 = new Student("Adam", 2, 3.6, "Male", Arrays.asList("Swimming", "Basketball", "Volleyball"),11);
        Student student2 = new Student("Jenny", 2, 3.8, "Female", Arrays.asList("Swimming", "Gymnastics", "Soccer"),12);
        Student student3 = new Student("Emily", 3, 4.0, "Female", Arrays.asList("Swimming", "Gymnastics", "Aerobics"),10);
        Student student4 = new Student("Dave", 3, 3.9, "Male", Arrays.asList("Swimming", "Gymnastics", "Soccer"),9);
        Student student5 = new Student("Sophia", 4, 3.5, "Female", Arrays.asList("Swimming", "Dancing", "Football"),15);
        Student student6 = new Student("James", 4, 3.9, "Male", Arrays.asList("Swimming", "Basketball","Baseball", "Volleyball"),14);

        studentList = Arrays.asList(student1, student2, student3, student4, student5, student6);
    }
    public static List<Student> getAllStudents(){
        if(null == studentDatabase){
            studentDatabase = new StudentDatabase();
        }
        return studentList;
    }
}
