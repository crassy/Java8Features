package com.balu.functionalInterfaces;

import com.balu.data.Student;
import com.balu.data.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    static List<Student> studentList = StudentDatabase.getAllStudents();

    public static void nameAndActivities(){
        BiConsumer<String, List<String>> studentNameAndActivities = (name, activities) -> System.out.println(name + " : "+activities);
        studentList.forEach(student -> studentNameAndActivities.accept(student.getName(), student.getActivities()));
    }
    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (a,b) ->{
            System.out.println("a : " + a + " b: " + b);
        };

        biConsumer.accept("Jeldi", "Balachandar");

        BiConsumer<Integer, Integer> multiply = (a,b) -> {
            System.out.println(" Product of " + a + " and " + b + " is: " + (a*b));
        };
        BiConsumer<Integer, Integer> division = (a,b) -> {
            System.out.println(" Division of " + a + " and " + b + " is: " + (a/b));
        };

        multiply.andThen(division).accept(10,5);


        nameAndActivities();
    }
}
