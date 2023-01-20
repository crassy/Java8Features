package com.balu.functionalInterfaces;

import com.balu.data.Student;
import com.balu.data.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    public static void main(String[] args) {
        new PredicateAndConsumerExample().printNameAndActivities(StudentDatabase.getAllStudents());
    }

    public void printNameAndActivities(List<Student> studentList){
        studentList.forEach(studentConsumer);
    }

    //Using Predicate.
    /*Predicate<Student> studentPredicateGradeLevel = (student) -> student.getGradeLevel() >= 3;
    Predicate<Student> studentPredicateGPA = (student) -> student.getGpa() >= 3.9;*/

    //Using BiPredicate.
    BiPredicate<Integer, Double> biPredicate = (gradeLevel, gpa) -> gradeLevel >= 3 && gpa >= 3.9;

    BiConsumer<String, List<String>> stringListBiConsumer = (name, activities) -> System.out.println(name + " : " + activities);

    Consumer<Student> studentConsumer = (student) -> {
        //Using Predicate.
        /**
         *
        if(studentPredicateGradeLevel.and(studentPredicateGPA).test(student)){
            stringListBiConsumer.accept(student.getName(), student.getActivities());
        }
         */

        //Using BiPredicate.
        if(biPredicate.test(student.getGradeLevel(), student.getGpa())){
            stringListBiConsumer.accept(student.getName(), student.getActivities());
        }
    };
}
