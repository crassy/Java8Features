package com.balu.functionalInterfaces;

import com.balu.data.Student;
import com.balu.data.StudentDatabase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static List<Student> studentList = StudentDatabase.getAllStudents();
    static Predicate<Student> studentPredicateGradeLevel = (student) -> student.getGradeLevel() >= 3;

    static Predicate<Student> studentPredicateGPA = (student) -> student.getGpa() >= 3.9;


    public static void filterStudents(){
        System.out.println("filterStudents");
        studentList.forEach(student -> {
            if (studentPredicateGradeLevel.and(studentPredicateGPA).negate().test(student)) {
                System.out.println(student+ " - ");
            } else{
                System.out.println(student + " + ");
            }
        });
    }

    public static void filterStudentsByGPA(){
        System.out.println("filterStudentsByGPA");
        studentList.forEach(student -> {
            if (studentPredicateGPA.test(student)) {
                System.out.println(student);
            }
        });
    }

    public static void filterStudentsByGradeLevel(){
        System.out.println("filterStudentsByGradeLevel");
        studentList.forEach(student -> {
            if (studentPredicateGradeLevel.test(student)) {
                System.out.println(student);
            }
        });
    }
    public static void main(String[] args) {
        filterStudentsByGradeLevel();
        filterStudentsByGPA();
        filterStudents();
    }
}
