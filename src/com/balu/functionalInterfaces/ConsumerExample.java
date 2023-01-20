package com.balu.functionalInterfaces;

import com.balu.data.Student;
import com.balu.data.StudentDatabase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static List<Student> studentList = StudentDatabase.getAllStudents();

    static Consumer<Student> studentConsumer = (student)-> System.out.println(student);
    static Consumer<Student> studentName = (student)-> System.out.print(student.getName());
    static Consumer<Student> studentActivities = (student)-> System.out.println(student.getActivities());


    public static void printName(){
        studentList.forEach(studentConsumer);
    }

    public static void printNameAndActivities(){
        studentList.forEach(studentName.andThen(studentActivities)); // Consumer Chaining.
    }

    public static void printNameAndActivitiesUsingCondition(){
        System.out.println("_______________--");
        studentList.forEach((student -> {
            if(student.getGradeLevel() >= 3 && student.getGpa() >= 3.9) {
                studentName.andThen(studentActivities).accept((student));
            }
        }));
    }

    public static void main(String[] args) {
        Consumer<String> consumer1 = (refVariable) -> System.out.println(refVariable.toUpperCase());

        consumer1.accept("Java 8");

//        printName();
//        printNameAndActivities();
        printNameAndActivitiesUsingCondition();
    }
}
